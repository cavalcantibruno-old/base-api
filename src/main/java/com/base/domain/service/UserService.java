package com.base.domain.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.base.domain.model.User;

public interface UserService {

	User findByEmail(String email);
	
	User createOrUpdate(User user);
		
	Optional<User> findById(Long id);
	
	void delete(Long id);
	
	Page<User> findAll(int page, int count);

}
