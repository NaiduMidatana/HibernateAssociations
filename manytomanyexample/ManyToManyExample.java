package com.mouritech.manytomanyexample;

import java.time.LocalDate;


import com.mouritech.manytomanyexample.entity.Orders;
import com.mouritech.manytomanyexample.dao.OrdersDao;
import com.mouritech.manytomanyexample.entity.Items;

public class ManyToManyExample {

	public static void main(String[] args) {
		// create employee
		Orders ord = new Orders("15",100f,LocalDate.of(1991, 11, 29));
		
		
		//create project
		Items itm = new Items("earphones","boat company");
		Items itm1 = new Items("vivo mobile","mobiles");
		
		//allocation of items for orders
		ord.getItems().add(itm);
		ord.getItems().add(itm1);
		
		//adding orders reference in the items
		itm.getOrders().add(ord);
		itm1.getOrders().add(ord);
		
		OrdersDao odao = new OrdersDao();
		odao.saveOrder(ord);
	
		

	}

}
