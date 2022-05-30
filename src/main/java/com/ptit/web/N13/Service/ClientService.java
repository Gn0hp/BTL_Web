package com.ptit.web.N13.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ptit.web.N13.Models.Client;
import com.ptit.web.N13.Models.Room;

@Service
public interface ClientService {
	Client saveClient(Client client);
	
	void updateClient(Client client);
	
	Client findById(int id);
	
	void deleteClient(int id);
	
    boolean clientCheckin(Client client);
    
}