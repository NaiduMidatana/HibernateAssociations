package com.mouritech.onetoonesample;




import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.mouritech.onetoonesample.dao.StockDao;
import com.mouritech.onetoonesample.model.Stock;
import com.mouritech.onetoonesample.model.StockDetails;

public class OneToOneMain {

	public static void main(String[] args) {
		
		String date = "28-01-2022";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate listedDate = LocalDate.parse(date,formatter);
		
		Stock stk = new Stock("896","firdges");
		StockDetails stkdetails = new StockDetails("samsung","samsungcom","bestcompany",listedDate);
		stk.setStockDetails(stkdetails);
		
		StockDao stkDao = new StockDao();
		stkDao.saveStock(stk);
	}
}


