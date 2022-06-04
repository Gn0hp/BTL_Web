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
@RequestMapping("/room/room-list")
@AllArgsConstructor
public class RoomlistController {
	@Autowired
	private RoomService roomService;

	@GetMapping("/luxury")
	public ModelAndView luxury(HttpSession session) {
		List<Room> rooms = roomService.findByType("Luxury");
		System.out.println("length of room: "+ rooms.size());
		ModelAndView mav = new ModelAndView("room-list");
		mav.addObject("rooms", rooms);
		mav.addObject("roomType", "Luxury");
		if(session.getAttribute("USERNAME")!=null) {
			mav.addObject("isLogin", true);
			mav.addObject("USERNAME", session.getAttribute("USERNAME"));
		}
		return mav;
	}
	@GetMapping("/superior")
	public ModelAndView superior(HttpSession session) {
		List<Room> rooms = roomService.findByType("Superior");
		System.out.println("length of room: "+ rooms.size());
		ModelAndView mav = new ModelAndView("room-list");
		mav.addObject("rooms", rooms);
		mav.addObject("roomType", "Superior");
		if(session.getAttribute("USERNAME")!=null) {
			mav.addObject("isLogin", true);
			mav.addObject("USERNAME", session.getAttribute("USERNAME"));
		}
		return mav;
	}@GetMapping("/family")
	public ModelAndView family(HttpSession session) {
		List<Room> rooms = roomService.findByType("Family");;
		System.out.println("length of room: "+ rooms.size());
		ModelAndView mav = new ModelAndView("room-list");
		mav.addObject("rooms", rooms);
		mav.addObject("roomType", "Family");
		if(session.getAttribute("USERNAME")!=null) {
			mav.addObject("isLogin", true);
			mav.addObject("USERNAME", session.getAttribute("USERNAME"));
		}
		return mav;
	}
	
}
