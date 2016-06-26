package com.ecom.services;

import java.io.Serializable;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.webflow.execution.RequestContext;

import com.ecom.dao.ShippingDAO;
import com.ecom.models.ShippingAddress;


@Service
public class ShippingServices implements Serializable {
	@Autowired
	private ShippingDAO shipDAO;
	public String addShippingAddress(ShippingAddress add, RequestContext context)
	{
		System.out.println(add);
		HttpServletRequest request = (HttpServletRequest )context.getExternalContext().getNativeRequest();  
		shipDAO.addShippingAddress(add, request.getUserPrincipal());
		return "success";
		
	}
}
