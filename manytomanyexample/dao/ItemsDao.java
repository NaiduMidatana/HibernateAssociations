package com.mouritech.manytomanyexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.manytomanyexample.entity.Items;

import com.mouritech.manytomanyexample.util.HibernateUtil;


public class ItemsDao {
	public void saveItem(Items itm) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the items object in to database
			session.save(itm);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Items getItems(Long itmid) {
		Transaction transaction = null;
		Items itemById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the item object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			itemById = session.get(Items.class, itmid);
			if(itemById!=null) {
				
				System.out.println("Employee details are = " + itemById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return itemById;
		
	}
}
