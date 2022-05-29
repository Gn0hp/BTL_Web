package com.ptit.web.N13.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ptit.web.N13.Service.*;
import com.ptit.web.N13.Models.*;

@Controller
@RequestMapping("/bill")
public class BillController {
    @Autowired
	private BillService billService;
    private BookingService bookingService;

    @GetMapping("/")
	public String login() {
		return "statistic";
	}

	@PostMapping("/")
	public String clientBill(@RequestParam("payment-date") String paymentDate) {
        Integer client_id = 5;
		System.out.println(paymentDate);
        List<Booking> booking = bookingService.findBytblClientId(client_id);
		System.out.print(booking.get(0).getBookingDate());
        Integer booking_id = booking.get(0).getID();
        List<Bill> bill = billService.findBytblBookingId(booking_id);
        System.out.print(bill.get(0).getAmount());
        return "statistic";
       
	}
}
