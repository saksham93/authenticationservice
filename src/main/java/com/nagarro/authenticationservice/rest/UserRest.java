package com.nagarro.authenticationservice.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.authenticationservice.dao.UserDao;

@RestController
public class UserRest {

	private static final List<User> USERS = new ArrayList<>();

	@Autowired
	private UserDao userDao;

	static {
		User user1 = new User(1L, "Sakshan", "saksham");
		USERS.add(user1);
	}

	@RequestMapping(value = "/authenticate/{uid}/{password}", method = RequestMethod.POST, produces = "application/json")
	public Boolean getCustomers(@PathVariable("üid") String id, @PathVariable("password") String password) {
		

		return userDao.authenticate(id,password);
	}
}
