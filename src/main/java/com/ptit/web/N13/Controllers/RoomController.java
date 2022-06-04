package com.ptit.web.N13.Controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

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
	public ModelAndView roomGrid(HttpSession session) {	
		ModelAndView model = new ModelAndView("room-grid");
		if(session.getAttribute("USERNAME")!=null) {
			model.addObject("isLogin", true);
			model.addObject("USERNAME", session.getAttribute("USERNAME"));
		}
		List<Room> rooms = roomService.viewRoom();
		model.addObject("rooms", rooms);
		System.out.println("length of room: "+ rooms.size());
		return model;
	}
	@GetMapping("/room-list")
	public ModelAndView roomList(HttpSession session) {
		List<Room> rooms = roomService.viewRoom();
		System.out.println("length of room: "+ rooms.size());
		ModelAndView mav = new ModelAndView("room-list");
		mav.addObject("rooms", rooms);
		if(session.getAttribute("USERNAME")!=null) {
			mav.addObject("isLogin", true);
			mav.addObject("USERNAME", session.getAttribute("USERNAME"));
		}
		return mav;
	}
	@GetMapping("/room-detail/{id}")
	public ModelAndView roomDetails(@PathVariable int id, HttpSession session) {
		ModelAndView mav = new ModelAndView("room-details");
		if(session.getAttribute("USERNAME")!=null) {
			mav.addObject("isLogin", true);
			mav.addObject("USERNAME", session.getAttribute("USERNAME"));
		}
		Room room = roomService.findById(id);
		mav.addObject("room", room);
		System.out.print(room.getName());
		return mav;
	}

	
}
