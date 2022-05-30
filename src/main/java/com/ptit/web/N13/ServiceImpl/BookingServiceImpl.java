package com.ptit.web.N13.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptit.web.N13.Models.*;
import com.ptit.web.N13.Repository.BookingRepo;
import com.ptit.web.N13.Service.BookingService;
@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	private BookingRepo bookingRepo;


	@Override
	public Booking saveBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepo.save(booking);
	}

	@Override
	public void updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		bookingRepo.save(booking);
	}

	@Override
	public Booking findById(int id) {
		// TODO Auto-generated method stub
		return bookingRepo.findById(id).orElse(null);
	}

	@Override
	public List<Booking> findByClientID(int id) {
		return bookingRepo.findByClientID(id);
	}
}