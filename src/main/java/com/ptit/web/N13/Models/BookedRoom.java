package com.ptit.web.N13.Models;

import java.util.Date;

public class BookedRoom {
	private int ID;
	private Date arrivalDate;
	private Date departureDate;
	private int  price;
	private Room room;
	private Booking booking;
	
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

	public int getPrice() {
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
