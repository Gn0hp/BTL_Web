package com.ptit.web.N13.Models;

import java.util.Date;

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
@Table(name = "tblbookedroom")
@Entity
public class BookedRoom {
	@Id
	@Column(name="ID" )
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	@Column(name="ArrivalDate")
	private Date arrivalDate;
	
	@Column(name="DepartureDate")
	private Date departureDate;
	
	@Column(name="NumberOfGuest")
	private int numberOfGuest;
	
	@Column(name="Price")
	private float  price;
	
	@ManyToOne
	@JoinColumn(name = "tblRoomId")
	private Room room;
	
	@ManyToOne
	@JoinColumn(name = "tblBookingId")
	private Booking booking;
	
	
	
	public BookedRoom(int iD, Date arrivalDate, Date departureDate, int numberOfGuest, float price, Room room,
			Booking booking) {
		super();
		ID = iD;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.numberOfGuest = numberOfGuest;
		this.price = price;
		this.room = room;
		this.booking = booking;
	}
	public BookedRoom() {}
	public BookedRoom(int iD, Date arrivalDate, Date departureDate, int price, Room room, Booking booking) {
		super();
		ID = iD;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.price = price;
		this.room = room;
		this.booking = booking;
	}

	public int getNumberOfGuest() {
		return numberOfGuest;
	}
	public void setNumberOfGuest(int numberOfGuest) {
		this.numberOfGuest = numberOfGuest;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public BookedRoom(Date arrivalDate, Date departureDate, int price, Room room, Booking booking) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.price = price;
		this.room = room;
		this.booking = booking;
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}


	
}
