package com.org.model;


import javax.persistence.*;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name= "user")
public class Users {
	private String role;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger id;
	private String name;
	private String password;
	private BigInteger phone;
	private String email;
	private boolean active;

	/**
	 * Parameterized Constructors of Users
	 */
	public Users(String userName, String Password, BigInteger Phone, String Email,boolean active, String Role) {
		this.name = userName;
		this.password = Password;
		this.phone = Phone;
		this.email = Email;
		this.role = Role;
		this.active=active;
		//this.id = Id;
	}

	/**
	 * Unparameterized Constructor of User
	 */
	public Users() {
	}
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	public String getRole() {
		return role;
	}

	public void setRole(String userType) {
		this.role = userType;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger userId) {
		this.id = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String userName) {
		this.name = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String userPassword) {
		this.password = userPassword;
	}

	public BigInteger getPhone() {
		return phone;
	}

	public void setPhone(BigInteger userPhone) {
		this.phone = userPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String userEmail) {
		this.email = userEmail;
	}
}
