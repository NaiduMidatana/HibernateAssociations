package com.mouritech.onetoonebidirectional.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity
@Table(name = "stock")
public class Stock {


	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stock_id")
	private Long stockId;
	
	@Column(name = "stock_code")
	private String stockCode;
	
	@Column(name = "stock_name")
	private String stockName;
	
	
	
	
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Stock(String stockCode, String stockName) {
		super();
		this.stockCode = stockCode;
		this.stockName = stockName;
	
	}





	public Stock(Long stockId, String stockCode, String stockName) {
		super();
		this.stockId = stockId;
		this.stockCode = stockCode;
		this.stockName = stockName;
		
	}





	//Joining two tables using one to one association
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "stock",fetch = FetchType.LAZY)
	
	private StockDetails stockDetails;





	public Long getStockId() {
		return stockId;
	}





	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}





	public String getStockCode() {
		return stockCode;
	}





	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}





	public String getStockName() {
		return stockName;
	}





	public void setStockName(String stockName) {
		this.stockName = stockName;
	}





	public StockDetails getStockDetails() {
		return stockDetails;
	}





	public void setStockDetails(StockDetails stockDetails) {
		this.stockDetails = stockDetails;
	}
	
}

