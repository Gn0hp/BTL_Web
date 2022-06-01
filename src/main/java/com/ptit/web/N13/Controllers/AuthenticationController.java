package com.ptit.web.N13.Controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ptit.web.N13.Models.Client;
import com.ptit.web.N13.Service.ClientService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/authentication")
@AllArgsConstructor
public class AuthenticationController {
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@PostMapping("/checkLogin")
	public String checkLogin(ModelMap model ,
			@RequestParam("username")String username,
			@RequestParam("password")String password,
			HttpSession session) {
		if(clientService.clientCheckin(username, password)){
			session.setAttribute("USERNAME", username);
			return "index";
		}
		else {
			model.addAttribute("ERROR","Thong tin dang nhap sai hoac tai khoan khong ton tai");
		}
		return "login";
		
	}
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
	@PostMapping("/signup")
	public String signupClient(HttpSession session ,ModelMap model,
			@RequestParam("yourname")String yourname,
			@RequestParam("username")String username,
			@RequestParam("password")String password) {
		int role = 1;
		if(clientService.clientCheckin(username, password)) {
			model.addAttribute("ERROR", "Ten dang nhap da ton tai");
			return "signup";
		}else {
			session.setAttribute("USERNAME", username);
			clientService.saveClient(new Client(yourname,username,password));
			return "index";
		}
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("USERNAME");
		return "redirect:/login";
	}
	
}
