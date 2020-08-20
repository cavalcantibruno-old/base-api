package com.base.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.base.domain.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	
}
