package com.esprit.examen.services;

import java.util.Date;
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.examen.entities.Client;
import com.esprit.examen.repositories.ClientRepository;


@Service

public class ClientServiceImpl implements IClientService {
	@Autowired 
	ClientRepository clientRepository;
	@Override
	public List<Client> retrieveAllClients() {
		return 	(List<Client>) clientRepository.findAll();

	}

	@Override
	public Client addClient(Client client) {
		clientRepository.save(client);
		return client;
	}

	@Override
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
	}

	@Override
	public Client updateClient(Client c) {
		clientRepository.save(c);
		return c ;
	}

	@Override
	public Client retrieveClient(Long id) {
		Client client=clientRepository.findById(id).get();
		return client;
	}

	@Override
	public List<Client> retrieveClientsByDateNaissance(Date datenaissance1, Date datenaissance2) {
		return null;
	}

	/*
	
	public List<Client> retrieveClientsByDateNaissance(Date datenaissance1, Date datenaissance2)
	{
			List<Client> list=clientRepository.retrieveClientsByDateNaissance(datenaissance1, datenaissance2);
			return list ;
			
	}*/

	
	
	

}
