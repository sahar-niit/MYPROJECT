package com.ecom.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ecom.dao.ProductDAO;
import com.ecom.models.Product;

@Service

public class ProductServices {
	
	@Autowired
	private ProductDAO productDAO;
	public void addProduct(Product p) {
		
		productDAO.addProduct(p);
		
	}
	public void updateProduct(Product p) {
		productDAO.updateProduct(p);
	}
	public List<Product> listProduct() {
		return productDAO.listProduct();
	}
	public Product getProductById(int id) {
		return productDAO.getProductById(id);
	}
	public void removeProduct(int id) {
		productDAO.removeProduct(id);
	}
	public void storeFile(Product p, HttpServletRequest request)
	{
		productDAO.storeFile(p,request);
	}
}
