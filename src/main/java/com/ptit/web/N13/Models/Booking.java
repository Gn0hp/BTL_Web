package com.ptit.web.N13.Models;

import java.util.Date;

public class Booking {
	private int ID;
	private Date bookingDate;
	private  String note;
	private Client client;
	public Booking() {}
	public Booking(int iD, Date bookingDate, String note, Client client) {
		super();
		ID = iD;
		this.bookingDate = bookingDate;
		this.note = note;
		this.client = client;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Booking(Date bookingDate, String note, Client client) {
		super();
		this.bookingDate = bookingDate;
		this.note = note;
		this.client = client;
	}
}
