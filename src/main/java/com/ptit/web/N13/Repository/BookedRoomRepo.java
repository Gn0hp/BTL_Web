package com.ptit.web.N13.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ptit.web.N13.Models.BookedRoom;

@Repository
public interface BookedRoomRepo extends CrudRepository<BookedRoom, Integer>{
	List<BookedRoom> findByRoomID(int id);
}
