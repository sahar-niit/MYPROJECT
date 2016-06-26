package com.ecom.dao;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecom.models.Cart;
import com.ecom.models.Customer;
import com.ecom.models.ShippingAddress;
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
		ur.setCustId(p.getCustId());
		session.save(ur);
		Cart c = new Cart();
		c.setGrandTotal(0);
		c.setUsersDetail(p);
		session.save(c);
		p.setCart(c);
		session.update(p);
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
	 public List<Customer> getAllUsers() {
	        Session session = sessionFactory.openSession();
	        Query query = session.createQuery("from Customer");
	        @SuppressWarnings("unchecked")
			List<Customer> usersDetail = query.list();

	        return usersDetail;
	    }

	    public Customer getUserByUsername (String username) {
	        Session session = sessionFactory.openSession();
	        
	        Query query = session.createQuery("from Customer where username = ?");
	        query.setString(0, username);

	        return (Customer) query.uniqueResult();
	    }

	   
}
