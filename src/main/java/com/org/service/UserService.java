package com.org.service;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.org.model.Users;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserService {


	public ResponseEntity<?> createUser(Users newUser);

	public Users updateUser(Users newUser);

	public String deleteUser(BigInteger UserId);

	public Iterable<Users> displayAllUser();

	public ResponseEntity<?> findUserById(BigInteger userId);
	Optional<Users> findByUsername(String username,String password);
}
