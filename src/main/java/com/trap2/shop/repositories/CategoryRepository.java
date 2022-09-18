package com.trap2.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trap2.shop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
