package com.nagarro.authenticationservice.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.nagarro.authenticationservice.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {
	@Value("${DB_HOST}")
	private String dbHost;
	
	@Value("${DB_PORT}")
	private String dbPort;
	
	@Value("${DATABASE}")
	private String database;

	@Value("${DB_PASSWORD}")
	private String dbPassword;

	@Value("${DB_USER}")
	private String dbUser;

	@Override
	public Integer getUsers() {
		  Connection conn;
		  Integer result = -1;
		try {
			conn = DriverManager.getConnection(
			           "jdbc:mysql://"+dbHost+":"+dbPort+"/"+database, dbUser, dbPassword);
	         Statement stmt = conn.createStatement();
	         ResultSet rs = stmt.executeQuery("select count(*) from user"); 
	         result = rs.getInt(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	               // MySQL: "jdbc:mysql://hostname:port/databaseName", "username", "password"
	 
	         // Step 2: Allocate a 'Statement' object in the Connection
		return result;
	}
	
	

}
