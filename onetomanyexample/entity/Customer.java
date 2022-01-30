package com.mouritech.onetomanyexample.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "customer_data")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private Long custId;
	
	@Column(name = "cust_name")
	private String custName;

	@Column(name = "cust_email")
	private String custEmail;
	

	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Orders> orders = new ArrayList<Orders>();
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getcustEmail() {
		return custEmail;
	}

	public void setcustEmail(String empEmail) {
		this.custEmail = empEmail;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Customer(Long custId, String custName, String custEmail) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		
	}

	public Customer(String custName, String custEmail) {
		super();
		this.custName = custName;
		this.custEmail = custEmail;
		
	}

	

	
	

	
	
 
}
