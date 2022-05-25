package com.ptit.web.N13.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Data
@Table(name = "tblbill")
@Entity
public class Bill {
	@Id
	@Column(name="Id",  nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	@Column(name = "PaymentDate")
	private Date paymentDate;
	
	@Column(name = "Amount")
	private float amount;
	
	@Column(name = "PaymentType")
	private String paymentType;
	
	@Column(name = "Note")
	private String note;
	
	@ManyToOne
	@JoinColumn(name = "tblBookingId")
	private Booking booking;
	
	public Bill(Date paymentDate, float amount, String paymentType, String note, Booking booking) {
		super();
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentType = paymentType;
		this.note = note;
		this.booking = booking;
	}
	public Bill(int iD, Date paymentDate, float amount, String paymentType, String note, Booking booking) {
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
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
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
	
}
