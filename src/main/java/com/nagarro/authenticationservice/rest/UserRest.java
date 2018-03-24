package com.nagarro.authenticationservice.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Named
@Path("/")
public class UserRest {

	private static final List<User> USERS = new ArrayList<>();
	static {
		User user1 = new User(1L, "Sakshan", "saksham");
		USERS.add(user1);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getCustomers() {
		return USERS;
	}
}
