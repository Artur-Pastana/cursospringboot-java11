package com.estudojava.curso.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.estudojava.curso.entities.pk.OrderItemPk;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPk id = new OrderItemPk();
	
	private Integer quantity;
	private Double preco;
	
	public OrderItem() {
	}

	public OrderItem(Order order, Product product, Integer quantity, Double preco) {
		super();
		this.id.setOrder(order);
		this.id.setProduct(product);
		this.quantity = quantity;
		this.preco = preco;
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		this.id.setOrder(order);
	}
	
	//@JsonIgnore//para não acontecer um loop infinito
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		this.id.setProduct(product);
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
