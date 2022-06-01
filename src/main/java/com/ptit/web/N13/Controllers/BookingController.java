package com.ptit.web.N13.Controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ptit.web.N13.Models.BookedRoom;
import com.ptit.web.N13.Models.Room;
import com.ptit.web.N13.Service.BookedRoomService;
import com.ptit.web.N13.Service.RoomService;
@Controller
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private BookedRoomService bookedRoomService;
	
	@PostMapping("/check-availability")
	public ModelAndView checkAvailability(@RequestParam("arrival-date") String arrivalDate, @RequestParam("departure-date") String departureDate,
			@RequestParam("guests") String guests) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		ModelAndView mav;
		System.out.printf("%d %s %s", (sdf.parse(arrivalDate).getTime()), departureDate, guests);
		
		Long arrivalTime = sdf.parse(arrivalDate).getTime(), departureTime = sdf.parse(departureDate).getTime();
		if(arrivalTime > departureTime) {
			//handle Error (report message )
			mav = new ModelAndView("index");
			return mav;
		}
		ArrayList<Room> availableRoom = new ArrayList<>();
		List<Room> rooms = roomService.viewRoom();
		for(Room room: rooms) {
			if(bookedRoomService.findByRoomID(room.getID()).size()==0) {
				availableRoom.add(room);
			}
		}
		
		if(availableRoom.size()==0) {
			mav = new ModelAndView("index");
			return mav;
		}
		for(int i = 0; i<availableRoom.size(); ++i) {
			if(availableRoom.get(i).getCapable()>Integer.parseInt(guests)) {
				availableRoom.remove(i);
			}
		}
		mav = new ModelAndView("room-list");
		mav.addObject("rooms", availableRoom);
		mav.addObject("roomType", "Available");
		return mav;
		
		
	}
	
	@PostMapping("/book-room")
	public ModelAndView bookRoom(@RequestParam("arrival-date") String arrivalDate, @RequestParam("departure-date") String departureDate,
			@RequestParam("rooms")String rooms, @RequestParam("guest") String guests, @RequestParam("roomID") String roomID) {
				ModelAndView mav = new ModelAndView("booking");
				System.out.printf("%s %s %s %s %s", arrivalDate, departureDate, rooms, guests, roomID);
				mav.addObject("room", roomService.findById(Integer.parseInt(roomID)));
				mav.addObject("arrivaldate", arrivalDate);
				mav.addObject("departuredate", departureDate);
				mav.addObject("rooms", rooms);
				mav.addObject("guests" ,guests);
		return mav;
		
	}
	
	@PostMapping("/confirm")
	public ModelAndView confirm(@RequestParam("roomID") String id, @RequestParam("roomName") String roomName, @RequestParam("roomType") String roomType,
			@RequestParam("arrivalDate") String arrivalDate, @RequestParam("departure-date") String departureDate,
			@RequestParam("rooms")String rooms, @RequestParam("guests") String guests
				
			) {
		BookedRoom bookedRoom = new BookedRoom();
		ModelAndView mav = new ModelAndView("booking");
		return mav;
		
	}
}
