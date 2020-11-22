package com.org.dao;
import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.org.model.Users;;

public interface UserDao extends CrudRepository<Users, BigInteger>{
    @Query("from Users where name=?1 and password=?2")
    Optional<Users> findByName(String name,String password);
}
