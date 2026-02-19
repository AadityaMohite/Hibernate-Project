package com.controller;

import com.entity.User;
import com.service.UserService;

public class UserController {

	UserService service = new UserService();
	
	public String saveuser(User user) {
		
		  String msg =     service.saveuser(user);
		
		return msg;
	}
	
	
	
}
