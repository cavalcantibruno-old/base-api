package com.base.api.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.base.api.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	User findByEmail(String email);
	
	Optional<User> findAllById(Long id);

	void deleteById(Long id);

}
