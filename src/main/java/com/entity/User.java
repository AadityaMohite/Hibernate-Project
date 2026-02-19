package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name="User_id")
	private int id;
    
    @Column(name="Username")
	private String username;
    
    @Column(name="Password")
	private String password;
    
    @Column(name="Email")
	private String email;
    
    @Column(name="Address")
	private String Address;
	
	
	
	
}
