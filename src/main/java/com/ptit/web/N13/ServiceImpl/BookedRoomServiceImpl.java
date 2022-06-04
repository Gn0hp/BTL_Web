package com.ptit.web.N13.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptit.web.N13.Models.*;
import com.ptit.web.N13.Repository.BillRepo;
import com.ptit.web.N13.Repository.BookedRoomRepo;
import com.ptit.web.N13.Service.BillService;
import com.ptit.web.N13.Service.BookedRoomService;

@Service
public class BookedRoomServiceImpl implements BookedRoomService{
    @Autowired
	private BookedRoomRepo bookedRoomRepo;

	@Override
	public List<BookedRoom> findByRoomID(int id) {
		// TODO Auto-generated method stub
		return bookedRoomRepo.findByRoomID(id);
	}

	@Override
	public BookedRoom save(BookedRoom bookedRoom) {
		// TODO Auto-generated method stub
		return bookedRoomRepo.save(bookedRoom);
	}



}