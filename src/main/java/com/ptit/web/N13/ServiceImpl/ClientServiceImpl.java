package com.ptit.web.N13.ServiceImpl;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ptit.web.N13.Models.Client;
import com.ptit.web.N13.Models.Client;
import com.ptit.web.N13.Service.ClientService;
import com.ptit.web.N13.Repository.*;

@Service
public class ClientServiceImpl implements ClientService{
	@Autowired
	private ClientRepo ClientRepo;

	@Override
	public Client saveClient(Client client) {
		// TODO Auto-generated method stub
		return ClientRepo.save(client);
	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		ClientRepo.save(client);
	}

	@Override
	public Client findById(int id) {
		// TODO Auto-generated method stub
		return ClientRepo.findById(id).orElse(null);
	}

	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		ClientRepo.deleteById(id);
	}

	@Override
	public boolean clientCheckin(Client user) {
		// TODO Auto-generated method stub
		List<Client> clientList = (List<Client>) ClientRepo.findAll();
		for(Client a: clientList) {
			if(a.getEmail().equals(user.getEmail()) && a.getPassword().equals(user.getPassword())) return true;
		}
	  return false;
	}
	

}