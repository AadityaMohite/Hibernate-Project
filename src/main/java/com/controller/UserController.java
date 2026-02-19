package com.controller;

import java.util.List;

import com.entity.User;
import com.service.UserService;

public class UserController {

	UserService service = new UserService();
	
	public String saveuser(User user) {
		
		  String msg =     service.saveuser(user);
		
		return msg;
	}
	
	public List<User> getAllusers(){
		
		List<User> users = service.getAllusers();
		
		return users;
	}
	
	public String Updateuser(User user) {
		
		return service.Updateuser(user);
	}
	
	public String DeleteUser(int id) {
		return service.DeleteUser(id);
	}
	
}
