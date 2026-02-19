package com.dao;

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
	
	
	
	
}
