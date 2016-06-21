package com.ecom.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecom.models.Customer;
import com.ecom.models.UserRoles;


@Repository
public class CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Transactional
	public void addCustomer(Customer p) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p);
		UserRoles ur = new UserRoles();
		ur.setAuthority("ROLE_USER");
		ur.setUsername(p.getUsername());
		System.out.println(p.getPassword());
		ur.setPassword(p.getPassword());
		ur.setEnabled(1);
		session.save(ur);
		tx.commit();
		session.close();
	}
	public Customer getCustomerById(int id) {
		Session session = sessionFactory.openSession();		
//		System.out.print(id);
		Customer p = (Customer) session.load(Customer.class, new Integer(id));
		session.close();
		return p;
	}

}
