package com.ptit.web.N13.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ptit.web.N13.Models.Client;
import com.ptit.web.N13.Service.ClientService;

@Controller
@RequestMapping("/authentication")
public class AuthenticationController {
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
	@PostMapping("/login")
	public String clientLogin(@RequestParam("username") String username ,@RequestParam("password") String password ) {
		System.out.println(username);
		System.out.println(password);
		if(clientService.clientCheckin(new Client(username, password)))
			return "index";
		return "login";
       
	}
}
