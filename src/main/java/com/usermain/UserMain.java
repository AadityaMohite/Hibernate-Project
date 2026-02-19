package com.usermain;

import java.util.List;
import java.util.Scanner;

import com.controller.UserController;
import com.entity.User;

public class UserMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		UserController controller = new UserController(); 
		
		
		
		
		
		while(true) {
			System.out.println("Menu");
			System.out.println("1.SaveUser");
			System.out.println("2.Show user data");
			System.out.println("3.Update Data");
			System.out.println("4.Delete Data");
			System.out.println("5.Exit");
			
			System.out.println("Enter the Option");
			int option = scanner.nextInt();
			
			
			switch(option) {
			
			case 1: System.out.println("Enter the User Id");
			        int id = scanner.nextInt();
			        
			        scanner.nextLine();
			        
			        System.out.println("Enter the Username");
			        String name = scanner.nextLine();
			        
			        System.out.println("Enter the Password");
			        String password = scanner.nextLine();
			        
			        System.out.println("Enter the User Email");
			        String email = scanner.nextLine();
			        
			        System.out.println("Enter the User Address");
			        String Address = scanner.nextLine();
			        
			        User user = new User(id,name,password,email,Address);
			       
			        String msg = controller.saveuser(user);
			        
			        System.out.println(msg);
			                
			        
			     
			       break;
			       
			
			case 2: 
			        
			        List<User> users = controller.getAllusers();
			        
			        for (User user3 : users) {
						System.out.println("Id       : "+user3.getId());
						System.out.println("Username : "+user3.getUsername());
						System.out.println("Email    : "+user3.getEmail());
						System.out.println("Password : "+user3.getPassword());
						System.out.println("Address  : "+user3.getAddress());
						System.out.println("------------------------------------------------");
					}
			        
			      break;
			
			      
			case 3:  System.out.println("Enter the User Id");
	                 int id3 = scanner.nextInt();
	        
	                   scanner.nextLine();
	        
	                 System.out.println("Enter the Username");
	                 String name2 = scanner.nextLine();
	        
	                 System.out.println("Enter the Password");
	                 String password3 = scanner.nextLine();
	        
	                 System.out.println("Enter the User Email");
	                 String email3 = scanner.nextLine();
	        
	                 System.out.println("Enter the User Address");
	                 String Address3 = scanner.nextLine();
	                
	                 
	                 User user4 = new User(id3, name2, password3, email3, Address3);
	                 
	                 String msg2 = controller.Updateuser(user4);
	                 System.out.println(msg2);
	                 
	             break;
	             
			case 4:  System.out.println("Enter the User_ID: ");
			         int id4 = scanner.nextInt();
			         
			        String msg3 = controller.DeleteUser(id4);
			        System.out.println(msg3);
			        
			     break;
			case 5 : System.out.println("Existing....");
			         return;
			         
			 default: System.out.println("Option is Invalid");
	                        
			}
			
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
}
