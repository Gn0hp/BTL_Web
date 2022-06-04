package com.ptit.web.N13.Controllers;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ptit.web.N13.Models.BookedRoom;
import com.ptit.web.N13.Models.Booking;
import com.ptit.web.N13.Models.Room;
import com.ptit.web.N13.Service.BookedRoomService;
import com.ptit.web.N13.Service.BookingService;
import com.ptit.web.N13.Service.ClientService;
import com.ptit.web.N13.Service.RoomService;
@Controller
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	private RoomService roomService;
	
	@Autowired
	private BookedRoomService bookedRoomService;
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private ClientService clientService;
	
	@PostMapping("/check-availability")
	public ModelAndView checkAvailability(@RequestParam("arrival-date") String arrivalDate, @RequestParam("departure-date") String departureDate,
			@RequestParam("guests") String guests, HttpSession session) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		ModelAndView mav;
		System.out.printf("%d %s %s", (sdf.parse(arrivalDate).getTime()), departureDate, guests);
		
		Long arrivalTime = sdf.parse(arrivalDate).getTime(), departureTime = sdf.parse(departureDate).getTime();
		if(arrivalTime > departureTime) {
			//handle Error (report message )
			mav = new ModelAndView("index");
			if(session.getAttribute("USERNAME")!=null) {
				mav.addObject("isLogin", true);
				mav.addObject("USERNAME", session.getAttribute("USERNAME"));
			}
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
			if(session.getAttribute("USERNAME")!=null) {
				mav.addObject("isLogin", true);
				mav.addObject("USERNAME", session.getAttribute("USERNAME"));
			}
			return mav;
		}
		for(int i = 0; i<availableRoom.size(); ++i) {
			if(availableRoom.get(i).getCapable()>Integer.parseInt(guests)) {
				availableRoom.remove(i);
			}
		}
		mav = new ModelAndView("room-list");
		if(session.getAttribute("USERNAME")!=null) {
			mav.addObject("isLogin", true);
			mav.addObject("USERNAME", session.getAttribute("USERNAME"));
		}
		mav.addObject("rooms", availableRoom);
		mav.addObject("roomType", "Available");
		return mav;
		
		
	}
	
	@PostMapping("/book-room")
	public ModelAndView bookRoom(@RequestParam("arrival-date") String arrivalDate, @RequestParam("departure-date") String departureDate,
			@RequestParam("rooms")String rooms, @RequestParam("guest") String guests, @RequestParam("roomID") String roomID) {
				ModelAndView mav = new ModelAndView("booking");
				System.out.println("Room id is "+ roomID);
				Room room = roomService.findById(Integer.parseInt(roomID));
				System.out.println(room.getName());
				mav.addObject("room", room);
				mav.addObject("arrivaldate", arrivalDate);
				mav.addObject("departuredate", departureDate);
				mav.addObject("rooms", rooms);
				mav.addObject("guests" ,guests);
		return mav;
		
	}
	
	@PostMapping("/confirm")
	public ModelAndView confirm(@RequestParam("roomID") String id, @RequestParam("roomName") String roomName, @RequestParam("roomType") String roomType,
			@RequestParam("arrivalDate") String arrivalDate, @RequestParam("departureDate") String departureDate,
			@RequestParam("rooms")String rooms, @RequestParam("guests") String guests,
			HttpSession session
			) throws NumberFormatException, ParseException, SQLException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date arrivaldate = sdf.parse(arrivalDate), departuredate=sdf.parse(departureDate);
		Room room = roomService.findById(Integer.parseInt(id));
		Date now = sdf.parse(sdf.format(new Date(System.currentTimeMillis()))) ;
		System.out.println("now time is:" + now.toString());
		Booking booking = new Booking( now, "", clientService.findByName((String) session.getAttribute("USERNAME")));
		bookingService.saveBooking(booking);
		int days = (int) ((departuredate.getTime() - arrivaldate.getTime()) / (60*60*24*1000));
		System.out.println("Days is " + days);
		int price=(int) room.getPrice() *days;
		BookedRoom bookedRoom = new BookedRoom(arrivaldate,departuredate , Integer.parseInt(guests), price,room, booking);
		bookedRoomService.save(bookedRoom);
		ModelAndView mav = new ModelAndView("index");
		if(session.getAttribute("USERNAME")!=null) {
			mav.addObject("isLogin", true);
			mav.addObject("USERNAME", session.getAttribute("USERNAME"));
		}
		return mav;
		
	}
}
