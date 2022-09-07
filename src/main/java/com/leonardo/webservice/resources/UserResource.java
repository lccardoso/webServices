package com.leonardo.webservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.webservice.entities.User1;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User1> findaAll(){
		User1 u = new User1(1L, "Maria", "maria@gamil.com", "99999", "12346");	
		return ResponseEntity.ok().body(u);
		
	}

}
