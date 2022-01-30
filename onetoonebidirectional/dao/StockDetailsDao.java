package com.mouritech.onetoonebidirectional.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.onetoonebidirectional.model.StockDetails;
import com.mouritech.onetoonebidirectional.util.HibernateUtil;

public class StockDetailsDao {
	public void saveStockDetails(StockDetails stkDetails) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(stkDetails);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public StockDetails getStockDetails(Long empDetailsId) {
		Transaction transaction = null;
		StockDetails stkDetailsById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			stkDetailsById = session.get(StockDetails.class, empDetailsId);
			if(stkDetailsById!=null) {
				
				System.out.println("Employee details are = " + stkDetailsById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return stkDetailsById;
		
	}
}

