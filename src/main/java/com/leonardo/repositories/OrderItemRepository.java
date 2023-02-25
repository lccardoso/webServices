package com.leonardo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
