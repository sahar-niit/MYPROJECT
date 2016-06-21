package com.ecom.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecom.models.Customer;

import com.ecom.sevices.CustomerServices;


@Controller
public class CustomerController {
	@Autowired
	private CustomerServices service;
	
	 @RequestMapping(value="/login", method = RequestMethod.GET)
	 public String login() {
	 
	  return "Login";
	 
	 }
	 @RequestMapping(value="/fail2login", method = RequestMethod.GET)
	 public ModelAndView loginerror(ModelMap model) {
	 
	
	  return new ModelAndView("Login","error",true);
	 
	 }
	@RequestMapping(value="/register" ,method=RequestMethod.GET )
	public ModelAndView RegisterPage()
	{
		return new ModelAndView("Register","customer",new Customer());
	}
	@RequestMapping(value="/register" ,method=RequestMethod.POST )
	public String RegisterActionPage(@ModelAttribute("customer") @Validated Customer c, BindingResult result, Model model)
	{
		if (result.hasErrors()) {
			
			return "Register";
		}
		else{
			  service.addCustomer(c);
			
			return "Login";
			
		}
		
	}
	
	 @RequestMapping(value="/logout", method = RequestMethod.GET)
	 public String logout(ModelMap model) {
	 
	  return "Login";
	 
	 }
	 @RequestMapping(value = "/welcome", method = RequestMethod.GET)
	    public String printWelcome(ModelMap model, Principal principal) {

	     //   String name = principal.getName();
	     //   model.addAttribute("username", name);
	     //   System.out.println(name);
	        return "index";

	    }


}
