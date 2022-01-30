package com.mouritech.manytomanyexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.manytomanyexample.entity.Orders;
import com.mouritech.manytomanyexample.util.HibernateUtil;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;



public class OrdersDao {
	public void saveOrder(Orders ord) {
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

	public Order getOrder(Long ordid) {
		Transaction transaction = null;
		Order ordById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			ordById = session.get(Order.class, ordid);
			if(ordById!=null) {
				
				System.out.println("Employee details are = " + ordById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return ordById;
		
	}
}
