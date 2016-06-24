package com.ecom.dao;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.ecom.models.Product;

@Repository
public class ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public void addProduct(Product p) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
	}
	
	public void updateProduct(Product p) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(p);
		tx.commit();
		session.close();
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProduct() {
		Session session = sessionFactory.openSession();
		
		List<Product> pList = session.createQuery("from Product").list();
		session.close();
		return pList;
	}

	public Product getProductById(int id) {
		
		Session session = sessionFactory.openSession();		
		System.out.println(session);
		Product p = (Product) session.load(Product.class, new Integer(id));
		System.out.println(p.getName());
		session.close();
		return p;
	}
	
	public void removeProduct(int id) {
		Session session = sessionFactory.openSession();
		
		Product p = (Product) session.load(Product.class, new Integer(id));
		Transaction tx = session.beginTransaction();
		if(null != p){
			session.delete(p);
		}
		tx.commit();
		session.close();
		
	}
	public void storeFile(Product p)
	{
		 
		MultipartFile file= p.getFile();
	
		if (!file.isEmpty()) {
			
		try{
		byte[] bytes =file.getBytes();
		System.out.println(file.getOriginalFilename());
		
		
		File serverFile = new File("C:/sahar/Ecllipse/workscape/ElectronicsStore/src/main/webapp/resources/Images/"+p.getCategory()+"/"+p.getImage());
		serverFile.createNewFile();
	
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(serverFile));
		stream.write(bytes);
		stream.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
			
	}
	}


}
