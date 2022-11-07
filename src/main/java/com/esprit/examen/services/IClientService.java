package com.esprit.examen.services;

import java.util.Date; 
import java.util.List;

import com.esprit.examen.entities.Client;




public interface IClientService {

	
	
	List<Client> retrieveAllClients();

	Client addClient(Client client);

	void deleteClient(Long id);

	Client updateClient(Client c);

	Client retrieveClient(Long id);
	
	List<Client> retrieveClientsByDateNaissance(Date datenaissance1, Date datenaissance2 );
	
}
