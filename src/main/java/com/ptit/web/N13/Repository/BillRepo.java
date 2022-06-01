package com.ptit.web.N13.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ptit.web.N13.Models.*;

@Repository
public interface BillRepo extends CrudRepository<Bill, Integer> {
    List<Bill> findByBookingID(int id);
}