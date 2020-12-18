package com.estudojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
