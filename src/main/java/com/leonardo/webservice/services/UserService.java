package com.leonardo.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.webservice.entities.User1;
import com.leonardo.webservice.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User1> findAll() {
		return repository.findAll();
	}
	
	public User1 findById(Long id) {
		Optional<User1> obj = repository.findById(id);
		return obj.get();
	}

}
