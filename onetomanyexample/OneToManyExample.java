package com.mouritech.onetomanyexample;

import java.time.LocalDate;
import java.util.List;

import com.mouritech.onetomanyexample.dao.OrdersDao;
import com.mouritech.onetomanyexample.dao.CustomerDao;
import com.mouritech.onetomanyexample.entity.Orders;
import com.mouritech.onetomanyexample.entity.Customer;

public class OneToManyExample {

	public static void main(String[] args) {
		
		CustomerDao custDao = new CustomerDao();
		OrdersDao orderDao = new OrdersDao();
		
		Customer cus = new Customer("naidu", "naidu@gmail.com");
		//empDao.saveEmployee(emp);
		
		//create some departments
		Orders ord = new Orders(100f,LocalDate.of(1978, 11, 21));
		cus.getOrders().add(ord);
		
		Orders ord1 = new Orders(200f,LocalDate.of(1978, 11, 21));
		cus.getOrders().add(ord1);
		
		custDao.saveCustomer(cus);
		
		System.out.println("Employee By ID  =" +custDao.getCustomer(1L));
		/*
		 * System.out.println("Department For ID  =" ); List<Department> deptList =
		 * empDao.getEmployee(1L).getDepartments(); System.out.println(deptList);
		 */
	}

}
