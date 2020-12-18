package com.estudojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.curso.entities.Category;
import com.estudojava.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
