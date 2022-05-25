package com.ptit.web.N13.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ptit.web.N13.Models.Room;
import com.ptit.web.N13.Service.RoomService;

@Controller
public class SiteController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/news")
	public String news() {
		return "news";
	}
}
