package com.base.api.domain.service;

import com.base.api.domain.model.Client;

public interface ClientService {

	Client createOrupdate(Client client);
	void delete(Long id);
}
