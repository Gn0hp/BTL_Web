package com.ptit.web.N13.Models;

import java.util.Date;

public class Bill {
	private int ID;
	private Date paymentDate;
	private float amount;
	private int paymentType;
	private String note;
	public Bill(Date paymentDate, float amount, int paymentType, String note, Booking booking) {
		super();
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentType = paymentType;
		this.note = note;
		this.booking = booking;
	}
	public Bill(int iD, Date paymentDate, float amount, int paymentType, String note, Booking booking) {
		ID = iD;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentType = paymentType;
		this.note = note;
		this.booking = booking;
	}
	public Bill() {}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public int getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	private Booking booking;
}
