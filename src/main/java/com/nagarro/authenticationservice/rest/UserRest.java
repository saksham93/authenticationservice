package com.nagarro.authenticationservice.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.authenticationservice.dao.UserDao;

@RestController
public class UserRest {

	private static final List<User> USERS = new ArrayList<>();
	
	@Autowired
	private  UserDao userDao;
	
	static {
		User user1 = new User(1L, "Sakshan", "saksham");
		USERS.add(user1);
	}

	@RequestMapping("/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Integer getCustomers() {
		
		return userDao.getUsers();
	}
}
