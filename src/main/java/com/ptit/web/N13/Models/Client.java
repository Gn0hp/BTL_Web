package com.ptit.web.N13.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "tblclient")
@Entity
public class Client {
	@Id
	@Column(name="Id", nullable = false )
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	@Column(name="Name", columnDefinition="date default null")
	private String name;
	
	@Column(name="Email",columnDefinition="date default null")
	private String email;
	
	@Column(name="PhoneNumber",columnDefinition="date default null")
	private String phoneNumber;
	
	@Column(name="Username",columnDefinition="date default null")
	private String username;
	
	@Column(name="Password",columnDefinition="date default null")
	private String password;
	
	@Column(name="Role",columnDefinition="date default null")
	private int role;
	public Client( String name, String email, String phoneNumber, String username, String password, int role) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public Client() {
		super();
	}
	public Client(String email,String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Client(String yourName, String email,String phone,String username, String password) {
		super();
		this.name = yourName;
		this.email = email;
		this.phoneNumber = phone;
		this.username=username;
		this.password = password;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return this.role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
}
