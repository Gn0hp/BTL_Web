package com.ptit.web.N13.Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
   	public ModelAndView bill(HttpSession session) {
    	ModelAndView model = new ModelAndView("statistic");
		if(session.getAttribute("USERNAME")!=null) {
			model.addObject("isLogin", true);
			model.addObject("USERNAME", session.getAttribute("USERNAME"));
		}
       	int id = 5;
           List<Booking> booking = bookingService.findByClientID(id);
           List<Bill> bills = new ArrayList<Bill>();
           for (int i = 0; i < booking.size(); i++) {
           	Integer booking_id = booking.get(i).getID();
           	List<Bill> bill = billService.findByBookingID(booking_id);
           	bills.add(bill.get(0));
           }
           model.addObject("bills", bills);
   		return model;
   	}	

	@PostMapping("/")
	public ModelAndView clientBill(@RequestParam("payment-date") String paymentDate, HttpSession session) {
		ModelAndView model = new ModelAndView("statistic");
		if(session.getAttribute("USERNAME")!=null) {
			model.addObject("isLogin", true);
			model.addObject("USERNAME", session.getAttribute("USERNAME"));
		}
        int id = 5;
		System.out.println(paymentDate);
        List<Booking> booking = bookingService.findByClientID(id);
        List<Bill> bills = new ArrayList<Bill>();
        for (int i = 0; i < booking.size(); i++) {
        	Integer booking_id = booking.get(i).getID();
        	List<Bill> bill = billService.findByBookingID(booking_id);
        	bills.add(bill.get(0));
        }
        model.addObject("bills", bills);
        return model;

	}
}