package com.ptit.web.N13.Controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @Autowired
    private BookingService bookingService;
    
    @Autowired
    private ClientService clientService;

    @GetMapping()
   	public String bill(Model model) {
       	int id = 5;
           List<Booking> booking = bookingService.findByClientID(id);
           List<Bill> bills = new ArrayList<Bill>();
           for (int i = 0; i < booking.size(); i++) {
           	Integer booking_id = booking.get(i).getID();
           	List<Bill> bill = billService.findByBookingID(booking_id);
           	bills.add(bill.get(0));
           }
           model.addAttribute("bills", bills);
   		return "statistic";
   	}	

	@PostMapping("/")
	public String clientBill(@RequestParam("payment-date") String paymentDate, Model model) {
        int id = 5;
		System.out.println(paymentDate);
        List<Booking> booking = bookingService.findByClientID(id);
        List<Bill> bills = new ArrayList<Bill>();
        for (int i = 0; i < booking.size(); i++) {
        	Integer booking_id = booking.get(i).getID();
        	List<Bill> bill = billService.findByBookingID(booking_id);
        	bills.add(bill.get(0));
        }
        model.addAttribute("bills", bills);
        return "statistic";

	}
}