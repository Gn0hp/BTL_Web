package com.ptit.web.N13.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.ptit.web.N13.Models.Room;


@Service
public interface RoomService {
	List<Room> viewRoom();

	Room saveProduct(Room room);

	void updateProduct(Room room);

	Room findById(int id);
	
	List<Room> findByType(String type);
}

