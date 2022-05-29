package com.ptit.web.N13.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ptit.web.N13.Models.Room;
import com.ptit.web.N13.Service.RoomService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/room")
@AllArgsConstructor
public class RoomController {
	@Autowired
	private RoomService roomService;
	
	@GetMapping("/room-grid")
	public String roomGrid(Model model) {	
		List<Room> rooms = roomService.viewRoom();
		model.addAttribute("rooms", rooms);
		System.out.println("length of room: "+ rooms.size());
		return "room-grid";
	}
	@GetMapping("/room-list")
	public String roomList() {
		List<Room> rooms = roomService.findByType("Luxury");
		System.out.println("length of room: "+ rooms.size());
		return "room-list";
	}
	@GetMapping("/room-detail/{id}")
	public ModelAndView roomDetails(@PathVariable int id) {
		ModelAndView mav = new ModelAndView("room-details");
		Room room = roomService.findById(id);
		mav.addObject("room", room);
		System.out.print(room.getName());
		return mav;
	}
	
}
