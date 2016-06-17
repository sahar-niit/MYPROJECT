package Com.Ecomm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Com.Ecomm.dao.ProductDAOImpl;
import Com.Ecomm.mymodels.Product;

@Service
public class ProductServiceImpl {
	
	@Autowired
	private ProductDAOImpl productS;
	
	
	@Transactional
	public void addProduct(Product p)
	{
		System.out.println(p);
		System.out.println(productS);
		
		productS.addProduct(p);
	}
	public void updateProduct(Product p)
	{
		this.productS.updateProduct(p);
	}
	
	public List<Product> listProducts()
	{
		return this.productS.listProducts();
	}
	
	public Product getProductById(int id)
	{
		return this.productS.getProductById(id);
	}
	
	
	public void removeProduct(int id) {
		
		this.productS.removeProduct(id);
	}
}
