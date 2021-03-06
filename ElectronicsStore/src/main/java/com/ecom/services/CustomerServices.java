package com.ecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.dao.CustomerDAO;

import com.ecom.models.Customer;


@Service
public class CustomerServices {
	@Autowired
	private CustomerDAO cust;
	public void addCustomer(Customer p) {
	
		cust.addCustomer(p);
		
	}
	public Customer getCustomerById(int id) {
		return cust.getCustomerById(id);
	}
	 public List<Customer> getAllUsers() {
		 return cust.getAllUsers();
	 }
	  public Customer getUserByUsername (String username) {
		  return cust.getUserByUsername(username);
	  }
}
