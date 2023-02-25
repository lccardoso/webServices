package com.leonardo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
