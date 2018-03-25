package com.nagarro.authenticationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.nagarro.authenticationservice.*")
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
