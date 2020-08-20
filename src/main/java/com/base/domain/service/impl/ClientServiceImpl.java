package com.base.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.base.domain.model.Client;
import com.base.domain.repository.ClientRepository;
import com.base.domain.service.ClientService;

public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public Client createOrupdate(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void delete(Long id) {
		clientRepository.deleteById(id);
	}

	
}
