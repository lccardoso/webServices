package com.leonardo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
