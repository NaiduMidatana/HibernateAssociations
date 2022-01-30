package com.mouritech.onetomanyexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.onetomanyexample.entity.Orders;
import com.mouritech.onetomanyexample.util.HibernateUtil;



public class OrdersDao {
	public void saveOders(Orders ord) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(ord);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Orders getOrder(Long orderid) {
		Transaction transaction = null;
		Orders orderById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			orderById = session.get(Orders.class, orderid);
			if(orderById!=null) {
				
				System.out.println("Employee details are = " + orderById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return orderById;
		
	}
}
