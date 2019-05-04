package com.apfmiranda.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apfmiranda.workshopmongo.domain.User;
import com.apfmiranda.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository; 
	
	public List<User> findAll() {
		return this.repository.findAll();
	}

}
