package com.mouritech.manytomanyexample.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "order_details")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Long orderId;
	
	@Column(name = "customer_id")
	private String customerId;
	
	@Column(name = "order_amount")
	private float orderAmount;
	
	@Column(name = "order_date")
	private LocalDate orderDate;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "items_orders",joinColumns = {@JoinColumn(name = "item_id")},
					inverseJoinColumns = {@JoinColumn(name = "order_id")})
	Set<Items> items = new HashSet<Items>();
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public float getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Set<Items> getItems() {
		return items;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}

	public Orders(Long orderId, String customerId, float orderAmount, LocalDate orderDate) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}

	public Orders(String customerId, float orderAmount, LocalDate orderDate) {
		super();
		this.customerId = customerId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerId=" + customerId + ", orderAmount=" + orderAmount
				+ ", orderDate=" + orderDate + ", items=" + items + "]";
	}






	
	
 
}

