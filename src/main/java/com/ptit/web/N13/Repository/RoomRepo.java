package com.ptit.web.N13.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ptit.web.N13.Models.*;


@Repository
public interface RoomRepo extends CrudRepository<Room, Integer> {

}
