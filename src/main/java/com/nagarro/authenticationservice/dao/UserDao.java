package com.nagarro.authenticationservice.dao;

public interface UserDao {
	

	Boolean authenticate(String id, String password);
	

}
