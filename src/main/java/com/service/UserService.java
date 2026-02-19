package com.service;

import java.util.List;

import com.dao.Userdao;
import com.entity.User;

public class UserService {

	Userdao dao = new Userdao();
	
	public String saveuser(User user) {
		
		    String msg  =  dao.saveuser(user);
		
		    return msg;
		
	}
	
	public List<User> getAllusers(){
		
		List<User> users = dao.getAlluser();
		
		return users;
	}
	
	public String Updateuser(User user) {
		return dao.Updateuser(user);
	}
	
	
	public String DeleteUser(int id) {
		return dao.DeleteByID(id);
	}
}
