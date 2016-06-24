package com.ecom.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecom.models.CardDetails;



@Repository
public class CardDetailDAO {

	 @Autowired
	    private SessionFactory sessionFactory;

	    public void addCardDetail(CardDetails cardDetail) {
	        Session session = sessionFactory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.saveOrUpdate(cardDetail);
	        tx.commit();
	        session.flush();
	        session.close();
	    }
}
