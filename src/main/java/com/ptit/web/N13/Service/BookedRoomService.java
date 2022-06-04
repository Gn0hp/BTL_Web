package com.ptit.web.N13.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.ptit.web.N13.Models.*;


@Service
public interface BookedRoomService {
	List<BookedRoom> findByRoomID(int id);
	BookedRoom save(BookedRoom bookedRoom);
}
