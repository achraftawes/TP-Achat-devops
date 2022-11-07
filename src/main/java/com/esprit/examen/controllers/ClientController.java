package com.esprit.examen.controllers;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.examen.entities.Client;
import com.esprit.examen.services.IClientService;



@RestController 
@CrossOrigin("*")
public class ClientController {
	//to create bean of implementation class
		@Autowired
		private IClientService clientServiceImpl ;
		//to call add or to save new client
		@PostMapping("/addClient") 
		@ResponseBody
		public Client saveClient(@RequestBody Client client) {
			System.out.println("Client add works properly !");
			Client c = clientServiceImpl.addClient(client);
			return c;
		}
		@PutMapping("/getAllClients")
		@ResponseBody
		public List<Client> findAllClient() {
			List<Client> show = clientServiceImpl.retrieveAllClients();  
			return show ; 
		}
		
		@PutMapping("/updateClients")
		@ResponseBody
		public Client updateClient(@RequestBody Client client) {
			return clientServiceImpl.updateClient(client);
		}
		@PutMapping("/deleteClients")
		@ResponseBody
		public String deleteClient(@RequestParam Long id_client) {
			clientServiceImpl.deleteClient(id_client);
			return "Client Deleted !";
		}

}
