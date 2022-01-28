package com.mouritech.onetoonesample.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_details")
public class StockDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long stockId;
	
	@Column(name = "comp_name")
	private String compName;
	
	@Column(name = "comp_desc")
	private String compDesc;
	
	@Column(name ="remarks")
	private String remarks;
	
	@Column(name = "listed_date")
	private LocalDate listedDate;
	
	

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getCompDesc() {
		return compDesc;
	}

	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public LocalDate getListedDate() {
		return listedDate;
	}

	public void setListedDate(LocalDate listedDate) {
		this.listedDate = listedDate;
	}

	public StockDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StockDetails(Long stockId, String compName, String compDesc, String remarks, LocalDate listedDate) {
		super();
		this.stockId = stockId;
		this.compName = compName;
		this.compDesc = compDesc;
		this.remarks = remarks;
		this.listedDate = listedDate;
	}

	public StockDetails(String compName, String compDesc, String remarks, LocalDate listedDate2) {
		super();
		this.compName = compName;
		this.compDesc = compDesc;
		this.remarks = remarks;
		this.listedDate = listedDate2;
	}
	
	
	
	
	
}
