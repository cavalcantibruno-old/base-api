package com.base.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.base.api.domain.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	
}
