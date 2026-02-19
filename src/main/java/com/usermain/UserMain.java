package com.usermain;

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
			       
			
			        
			
			
			}
			
			
		}
		
		
		
		
		
	}
	
	
	
}
