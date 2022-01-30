package com.mouritech.onetomanyexample.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept_data")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int orderId;
	
	@Column(name = "order_amount")
	private float orderAmount;
	
	@Column(name = "order_date")
	private LocalDate orderDate;
	

	public Orders() {
		// TODO Auto-generated constructor stub
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
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


	public Orders(int orderId, float orderAmount, LocalDate orderDate) {
		super();
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}


	public Orders(float orderAmount, LocalDate orderDate) {
		super();
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}


	
}
