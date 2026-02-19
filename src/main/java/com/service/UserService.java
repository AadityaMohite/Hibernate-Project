package com.service;

import com.dao.Userdao;
import com.entity.User;

public class UserService {

	Userdao dao = new Userdao();
	
	public String saveuser(User user) {
		
		    String msg  =  dao.saveuser(user);
		
		    return msg;
		
	}
	
	
	
}
