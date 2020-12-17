package com.estudojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
