package com.base.api.domain.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.base.api.domain.model.User;
import com.base.api.domain.repository.UserRepository;
import com.base.api.domain.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		return this.userRepository.save(user);
	}
	
	@Override
	public Optional<User> findById(Long id) {
		return this.userRepository.findAllById(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		this.userRepository.deleteById(id);;
		
	}

	@Override
	public Page<User> findAll(int page, int count) {
		Pageable pages = PageRequest.of(page, count);
		return this.userRepository.findAll(pages);
	}
	
}
