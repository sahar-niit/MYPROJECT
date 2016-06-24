package com.ecom.dao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
@Component
public class CartHandler {
	 public String checkUser(HttpServletRequest request)
	    {
	    	if(request.getUserPrincipal().getName()!=null)
	    		return "loggedIn";
	    	else 
	    		return "needsLogin";
	    }


}
