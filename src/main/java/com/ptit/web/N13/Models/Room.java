package com.ptit.web.N13.Models;

public class Room {
	private int ID;
	private String name;
	private String type;
	private float price;
	private String description;
	private String image;
	private Hotel hotel;
	public Room(int iD, String name, String type, float price, String description, String image, Hotel hotel) {
		super();
		ID = iD;
		this.name = name;
		this.type = type;
		this.price = price;
		this.description = description;
		this.image = image;
		this.hotel = hotel;
	}
	public Room(String name, String type, float price, String description, String image, Hotel hotel) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.description = description;
		this.image = image;
		this.hotel = hotel;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Room() {
		super();
	}
}
