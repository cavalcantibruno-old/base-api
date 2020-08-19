package com.base;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.base.api.domain.model.User;
import com.base.api.enuns.ProfileEnum;
import com.base.api.repository.UserRepository;

@SpringBootApplication
public class BaseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseApiApplication.class, args);
	}
	
	 @Bean
	    CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
	        return args -> {
	            initUsers(userRepository, passwordEncoder);
	        };

	    }
	    
		private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
	        User admin = new User();
	        admin.setEmail("admin@jardimdacolina.com.br");
	        admin.setPassword(passwordEncoder.encode("123456"));
	        admin.setProfile(ProfileEnum.ROLE_ADMIN);

	        User find = userRepository.findByEmail("admin@jardimdacolina.com.br");
	        if (find == null) {
	            userRepository.save(admin);
	        }
	    }
		

}
