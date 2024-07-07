package com.FrontendBackendConnectivity.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FrontendBackendConnectivity.Entity.Client;
import com.FrontendBackendConnectivity.Repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository clientRepository;
	public boolean saveClient(Client client) {
		try {
			Client savedClient=clientRepository.save(client);
			if(savedClient!=null) {
				return true;
			}
			else {
				return false;
			}
		} catch(Exception e) {
			 
		}
		return false;
		
	}
	public List<Client> getClient(){
		return clientRepository.findAll();
	}
	

}
