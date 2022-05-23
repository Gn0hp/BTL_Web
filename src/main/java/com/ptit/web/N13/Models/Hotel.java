package com.ptit.web.N13.Models;

public class Hotel {
	private int ID;
	private String name;
	private String phoneNumber;
	private String emailAddress;
	private String description;
	public Hotel(int iD, String name, String phoneNumber, String emailAddress, String description) {
		super();
		ID = iD;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.description = description;
	}
	public Hotel(String name, String phoneNumber, String emailAddress, String description) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.description = description;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Hotel() {
		super();
	}
}
