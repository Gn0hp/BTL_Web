package com.ptit.web.N13.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/room")
public class RoomController {
	@GetMapping("/room-grid")
	public String roomGrid() {
		return "room-grid";
	}
	@GetMapping("/room-list")
	public String roomList() {
		return "room-list";
	}
	@GetMapping("/room-detail")
	public String roomDetail() {
		return "room-detail";
	}
}
