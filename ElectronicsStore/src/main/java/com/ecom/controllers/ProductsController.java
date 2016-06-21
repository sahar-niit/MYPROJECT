package com.ecom.controllers;


import java.security.Principal;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;

import com.ecom.models.Product;
import com.ecom.sevices.ProductServices;

@Controller
public class ProductsController {
	
	@Autowired
	private ProductServices service;
	@RequestMapping(value="/" ,method=RequestMethod.GET )
	public String indexPage()
	{
		
		return "index";
	}
	@RequestMapping(value="/about", method=RequestMethod.GET )
	public String aboutPage()
	{
		return "AboutUs";
	}
	@RequestMapping(value="/contact", method=RequestMethod.GET )
	public String ContactPage()
	{
		return "ContactUs";
	}	
	@RequestMapping(value="/details", method=RequestMethod.GET )
	public String DetailsPage()
	{
		return "DisplayDetails";
	}
	@RequestMapping(value="/disp", method=RequestMethod.GET )
	public String ViewAllPage()
	{
		return "ViewAll";
	}
	@RequestMapping(value="/data", method=RequestMethod.GET )
	public @ResponseBody List<Product> Data()
	{
		
		return service.listProduct();
		
	}
	@RequestMapping(value="/add", method=RequestMethod.GET )
	public ModelAndView AddPage()
	{
		return new ModelAndView("Add","product",new Product());
	}
	@RequestMapping(value="/add", method=RequestMethod.POST )
	public String AddActionPage(@ModelAttribute("product") @Validated Product p, BindingResult result, Model model)
	{
		if (result.hasErrors()) {
			
			return "Add";
		}
		else{
			p.setImage(p.getFile().getOriginalFilename());
				service.storeFile(p);
				service.addProduct(p);
		return "addmore";
		}
	}
	@RequestMapping(value="/delete", method=RequestMethod.GET )
	public String  DeletePage()
	{
		return "Delete";
	}
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String  DeleteActionPage(@RequestParam("id") int id)
	{
		service.removeProduct(id);
		return "index";
	}
	@RequestMapping(value="/edit", method=RequestMethod.GET )
	public ModelAndView EditPage(@RequestParam("id") int id)
	{
		
		Product p = service.getProductById(id);
		
		
		return new ModelAndView("Edit","product",p);
	}
	@RequestMapping(value="/edit", method=RequestMethod.POST )
	public String EditActionPage(@ModelAttribute("product") @Validated Product p, BindingResult result, Model model)
	{
if (result.hasErrors()) {
			
			return "Edit";
		}
		else{
			p.setImage(p.getFile().getOriginalFilename());
			service.storeFile(p);
			service.updateProduct(p);
			return "index";
		}
		
	}
}

