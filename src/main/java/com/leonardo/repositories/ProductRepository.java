package com.leonardo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
