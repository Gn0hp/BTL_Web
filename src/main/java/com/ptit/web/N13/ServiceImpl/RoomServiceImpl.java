package com.ptit.web.N13.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptit.web.N13.Models.Room;
import com.ptit.web.N13.Repository.RoomRepo;
import com.ptit.web.N13.Service.RoomService;
@Service
public class RoomServiceImpl implements RoomService{
	@Autowired
	private RoomRepo roomRepo;


	@Override
	public List<Room> viewRoom() {
		// TODO Auto-generated method stub
		return (List<Room>) roomRepo.findAll();
	}

	@Override
	public Room saveProduct(Room room) {
		// TODO Auto-generated method stub
		return roomRepo.save(room);
	}

	@Override
	public void updateProduct(Room room) {
		// TODO Auto-generated method stub
		roomRepo.save(room);
	}

	@Override
	public Room findById(int id) {
		// TODO Auto-generated method stub
		return roomRepo.findById(id).orElse(null);
	}

	@Override
	public List<Room> findByType(String type) {
		return roomRepo.findByType(type);
	}

}
