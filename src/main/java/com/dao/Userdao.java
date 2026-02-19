package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateConfig;
import com.entity.User;


public class Userdao {

	SessionFactory sf =   HibernateConfig.getSessionFactory();
	public String saveuser(User user) {
		 
		
		 
		    Session  ss =   sf.openSession();
		    
		   Transaction  tr =   ss.beginTransaction();
		   
		   ss.save(user);
		   tr.commit();
		   ss.close();
		   
		   return "User is Save Successfully";
		   
		 
	 }
	
	
	public List<User> getAlluser() {
		
		Session session = sf.openSession();
		
	  List<User> users =	session.createQuery("from User").list();
	  
	     return users;
		
		
	}
	
	public String Updateuser(User user) {
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		                 User existingUser = session.get(User.class, user.getId());
		                 
		                 existingUser.setUsername(user.getUsername());
		                 existingUser.setEmail(user.getEmail());
		                 existingUser .setAddress(user.getAddress());
		                 existingUser.setPassword(user.getPassword());
		
		                 tr.commit();
		                 session.close();
		                 
		                 return "User details is Updated";
		
		
	}
	
	
	public String DeleteByID(int id) {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		User deleteUser = session.get(User.class, id);
		
		    session.delete(deleteUser);
		    
		    tr.commit();
		    session.close();
		    
		    return"Delted User Details";
		
		
		
		
	}
	
	
	
}
