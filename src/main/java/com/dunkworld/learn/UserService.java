package com.dunkworld.learn;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	
	
	public String addUser(String username, String password) { 
		return username + " added successfully";
	}
}
