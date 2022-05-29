package com.ptit.web.N13.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "tblRoom")
@Entity
public class Room {
	@Id
	@Column(name="Id", nullable = false )
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Type")
	private String type;
	
	@Column(name="Price")
	private float price;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Image")
	private String image;
	
	@ManyToOne
	@JoinColumn(name = "HotelId")
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
