package com.base.domain.service;

import com.base.domain.model.Client;

public interface ClientService {

	Client createOrupdate(Client client);
	void delete(Long id);
}
