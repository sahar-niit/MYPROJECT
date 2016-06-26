package com.ecom.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;

import com.ecom.models.Product;
import com.ecom.services.ProductServices;

@Controller
public class ProductsController {

	@Autowired
	private ProductServices service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String indexPage() {

		return "index";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String aboutPage() {
		return "AboutUs";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String ContactPage() {
		return "ContactUs";
	}

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String DetailsPage() {
		return "DisplayDetails";
	}

	@RequestMapping(value = "/disp", method = RequestMethod.GET)
	public String ViewAllPage() {
		return "ViewAll";
	}

	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public @ResponseBody List<Product> Data() {

		return service.listProduct();

	}

	@RequestMapping(value = "/dataById/{pid}", method = RequestMethod.GET)
	public @ResponseBody Product dataById(@PathVariable("pid") int id) {

		return service.getProductById(id);

	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView AddPage() {
		return new ModelAndView("Add", "product", new Product());
	}

	@RequestMapping(value = "/checkadd", method = RequestMethod.POST)
	public ModelAndView AddActionPage(HttpServletRequest request,@ModelAttribute("product") @Validated Product p, 
			BindingResult result, Model model) {
		System.out.println("adding...");
		if (result.hasErrors()) {

			return new ModelAndView("Add");
		} else {
			p.setImage(p.getFile().getOriginalFilename());
			service.storeFile(p, request);
			service.addProduct(p);
			return new ModelAndView("ViewAll","msg","Product Added Sucessfully");
		}
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeletePage() {
		return "Delete";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView DeleteActionPage(@RequestParam("id") int id) {
		service.removeProduct(id);
		return new ModelAndView("ViewAll","msg","Product Deleted Sucessfully");
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView EditPage(@RequestParam("id") int id) {

		Product p = service.getProductById(id);

		return new ModelAndView("Edit", "product", p);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView EditActionPage(HttpServletRequest request,@ModelAttribute("product") @Validated Product p, BindingResult result, Model model) {
		
		if (result.hasErrors()) {

			return new ModelAndView("Edit");
		} else {
			System.out.println(p.getImage());
			if(!(p.getFile().isEmpty()))
			{
			p.setImage(p.getFile().getOriginalFilename());
			service.storeFile(p,request);
			}
			service.updateProduct(p);
			return new ModelAndView("ViewAll","msg","Product Updated Sucessfully");
		}

	}
}
