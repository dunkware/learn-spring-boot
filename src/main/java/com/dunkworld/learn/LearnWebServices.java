package com.dunkworld.learn;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dunkworld.learn.model.TradeRequest;

@RestController
public class LearnWebServices {

	
	@Autowired()
	private UserService userService; 
	
	@GetMapping(path = "/learn/echo")
	public int echo(@RequestParam() int echo) { 
		int results = 0;
		results = echo + 1; 
		return results;
				
	}
	
	
	
	@PostMapping(path = "/learn/trade/request")
	public String tradeRequest(@RequestBody() TradeRequest request) { 
		return request.getSymbol();
	}
	
	
	@GetMapping(path = "/learn/user/add")
	public String addUser(@RequestParam String username, @RequestParam String password) { 
		return userService.addUser(username, password);
	}
	
	
}
