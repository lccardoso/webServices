package com.leonardo.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.webservice.entities.User1;

public interface UserRepository extends JpaRepository<User1, Long> {
	
	

}
