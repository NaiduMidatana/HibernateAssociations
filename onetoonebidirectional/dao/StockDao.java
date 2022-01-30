package com.mouritech.onetoonebidirectional.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.onetoonebidirectional.model.Stock;
import com.mouritech.onetoonebidirectional.util.HibernateUtil;

public class StockDao {
	public void saveStock(Stock stk) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(stk);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Stock getStock(Long stkid) {
		Transaction transaction = null;
		Stock stkById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			stkById = session.get(Stock.class, stkid);
			if(stkById!=null) {
				
				System.out.println("Employee details are = " + stkById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return stkById;
		
	}
}
