package com.ptit.web.N13.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.ptit.web.N13.Models.*;


@Service
public interface BillService {
	Bill saveBill(Bill bill);

	void updateBill(Bill bill);

	Bill findById(int id);
	
    List<Bill> findBytblBookingId(int id);
}

