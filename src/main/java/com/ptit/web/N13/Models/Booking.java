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
@Table(name = "tblBooking")
@Entity
public class Booking {
	@Id
	@Column(name="Id", nullable = false )
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	@Column(name="BookingDate" )
	private Date bookingDate;
	
	@Column(name="Note")
	private  String note;
	
	@ManyToOne
	@JoinColumn(name = "tblClientId")
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
