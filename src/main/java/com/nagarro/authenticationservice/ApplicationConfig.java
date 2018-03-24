package com.nagarro.authenticationservice;

import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Named
	public static class JerseyConfig extends ResourceConfig{
		public JerseyConfig() {
			this.packages("com.nagarro.authenticationservice.rest");
		}
	}

}
