package com.org.service;

import java.math.BigInteger;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.org.dao.UserDao;
import com.org.exceptions.RecordAlreadyPresentException;
import com.org.exceptions.RecordNotFoundException;
import com.org.model.Users;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public ResponseEntity<?> createUser(Users newUser) {
		// TODO Auto-generated method stub
		try {
			userDao.save(newUser);
			return new ResponseEntity<Users>(newUser, HttpStatus.OK);
		}catch (RecordAlreadyPresentException e) {

			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public Users updateUser(Users updateUser) {
		// TODO Auto-generated method stub
		Optional<Users> findUserById = userDao.findById(updateUser.getId());
		if (findUserById.isPresent()) {
			userDao.save(updateUser);
		} else
			throw new RecordNotFoundException(
					"User with Id: " + updateUser.getId() + " not exists!!");
		return updateUser;
	}

	@Override
	public String deleteUser(BigInteger UserId) {
		// TODO Auto-generated method stub
		Optional<Users> findBookingById = userDao.findById(UserId);
		if (findBookingById.isPresent()) {
			userDao.deleteById(UserId);
			return "User Deleted!!";
		} else
			throw new RecordNotFoundException("User not found for the entered UserID");
	}

	@Override
	public Iterable<Users> displayAllUser() {
		//System.out.println("display");
		// TODO Auto-generated method stub
		List<Users> users= (List<Users>) userDao.findAll();
		System.out.println(users.size());
		return userDao.findAll();
	}

	@Override
	public ResponseEntity<?> findUserById(BigInteger userId) {
		// TODO Auto-generated method stub
		Optional<Users> findById = userDao.findById(userId);
		try {
			if (findById.isPresent()) {
				Users findUser = findById.get();
				return new ResponseEntity<Users>(findUser, HttpStatus.OK);
			} else
				throw new RecordNotFoundException("No record found with ID " + userId);
		} catch (RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public Optional<Users> findByUsername(String username,String password) {
		System.out.println("Find");
		return userDao.findByName(username,password);
	}

}
