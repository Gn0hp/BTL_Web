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
	public ModelAndView checkLogin(
			@RequestParam("username")String username,
			@RequestParam("password")String password,
			HttpSession session) {
		ModelAndView model = new ModelAndView("index");
		if(clientService.clientCheckin(username, password)){
			session.setAttribute("USERNAME", username); 
			model.addObject("isLogin", true);
			model.addObject("USERNAME", session.getAttribute("USERNAME"));
			return model;
		}
		model = new ModelAndView("login");
		model.addObject("ERROR","Thong tin dang nhap sai hoac tai khoan khong ton tai");
		model.addObject("isLogin", false);
		return model;
		
	}
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
	@PostMapping("/signup")
	public ModelAndView signupClient(HttpSession session ,
			@RequestParam("name")String name,
			@RequestParam("email")String email,
			@RequestParam("phone")String phone,
			@RequestParam("password")String password,
			@RequestParam("confirmpass")String confirmpass) {
		ModelAndView model = new ModelAndView("signup");
		if(clientService.clientCheckin(name, password)) {
			model.addObject("ERROR", "Ten dang nhap da ton tai");
			return model;
		}
		else if(!password.equals(confirmpass)){
			model.addObject("ERROR","sai password");
			return model;
		}
			else {
			model = new ModelAndView("login");
			session.setAttribute("USERNAME", name);
			clientService.saveClient(new Client(name,email,phone,name,password,1));
			model.addObject("Notification","Dang ki thanh cong. Vui long dang nhap lai.");
			return model;
		}
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("USERNAME");
		return "index";
	}
	
}
