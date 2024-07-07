package com.FrontendBackendConnectivity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FrontendBackendConnectivity.Entity.Client;
import com.FrontendBackendConnectivity.Services.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	ClientService clientService;
	@PostMapping(path="/save") 
	public ResponseEntity<String> saveClient(@RequestBody Client client){
		if(clientService.saveClient(client)) {
			return new ResponseEntity<>("Client save ho chuka hai",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Client save nhi ho chuka hai",HttpStatus.INTERNAL_SERVER_ERROR );
		}
		
	}
	@GetMapping(path="/getClients")
	public ResponseEntity<List<Client>> getClient(){
		return new ResponseEntity<>(clientService.getClient(),HttpStatus.OK);
		
	}

}
