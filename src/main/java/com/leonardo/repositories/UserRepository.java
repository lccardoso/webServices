package com.leonardo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.entity.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
