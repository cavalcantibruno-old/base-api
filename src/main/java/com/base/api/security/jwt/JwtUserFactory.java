package com.base.api.security.jwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.base.api.domain.model.User;
import com.base.api.enuns.ProfileEnum;

public class JwtUserFactory {

	private JwtUserFactory() {	
	}
	
	public static JwtUser create(User user) {
		return new JwtUser(user.getId(), user.getEmail(), user.getPassword(), 
				mapToGrantedAuthorities(user.getProfile()));
	}

	private static List<GrantedAuthority> mapToGrantedAuthorities(ProfileEnum profile) {
		List<GrantedAuthority> authorites = new ArrayList<GrantedAuthority>();
		authorites.add(new SimpleGrantedAuthority(profile.toString()));
		return authorites;
	}
}