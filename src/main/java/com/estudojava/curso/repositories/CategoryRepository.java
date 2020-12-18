package com.estudojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
