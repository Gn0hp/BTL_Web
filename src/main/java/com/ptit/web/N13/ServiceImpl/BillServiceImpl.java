package com.ptit.web.N13.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptit.web.N13.Models.*;
import com.ptit.web.N13.Repository.BillRepo;
import com.ptit.web.N13.Service.BillService;
@Service
public class BillServiceImpl implements BillService{
    @Autowired
	private BillRepo billRepo;


	@Override
	public Bill saveBill(Bill bill) {
		// TODO Auto-generated method stub
		return billRepo.save(bill);
	}

	@Override
	public void updateBill(Bill bill) {
		// TODO Auto-generated method stub
		billRepo.save(bill);
	}

	@Override
	public Bill findById(int id) {
		// TODO Auto-generated method stub
		return billRepo.findById(id).orElse(null);
	}

    @Override
	public List<Bill> findBytblBookingId(int id) {
		return billRepo.findBytblBookingId(id);
	}

}
