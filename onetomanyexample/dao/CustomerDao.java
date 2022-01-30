package com.mouritech.onetomanyexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.onetomanyexample.entity.Customer;
import com.mouritech.onetomanyexample.util.HibernateUtil;



public class CustomerDao {
	public void saveCustomer(Customer cust) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(cust);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Customer getCustomer(Long custid) {
		Transaction transaction = null;
		Customer custById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			custById = session.get(Customer.class, custid);
			if(custById!=null) {
				
				System.out.println("Employee details are = " + custById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return custById;
		
	}
}
