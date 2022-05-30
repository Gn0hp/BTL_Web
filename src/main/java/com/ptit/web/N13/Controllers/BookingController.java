package com.ptit.web.N13.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/booking")
public class BookingController {
	@PostMapping("/check-availability")
	public String checkAvailability(@RequestParam("arrival-date") String arrivalDate, @RequestParam("departure-date") String departureDate,
			@RequestParam("guests") String guests) {
		
		System.out.printf("%s %s %s", arrivalDate, departureDate, guests);
		return "index";
	}
}
