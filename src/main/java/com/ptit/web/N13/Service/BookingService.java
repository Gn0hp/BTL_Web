package com.ptit.web.N13.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.ptit.web.N13.Models.*;



@Service
public interface BookingService {
	Booking saveBooking(Booking booking);

	void updateBooking(Booking booking);

	Booking findById(int id);
	
	List<Booking> findBytblClientId(int id);
}
