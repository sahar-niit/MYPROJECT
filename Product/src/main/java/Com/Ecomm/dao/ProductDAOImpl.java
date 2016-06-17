package Com.Ecomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import Com.Ecomm.mymodels.Product;

@Repository
public class ProductDAOImpl {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Transactional
	public void addProduct(Product p)
	{
		try{
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
		}
		catch(Exception ex)
		{
			throw ex;
		}
		
		
	
	
	}
	@Transactional
	public void updateProduct(Product p) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(p);
		tx.commit();
		session.close();
	}
	public List<Product> listProducts() {
		Session session = sessionFactory.openSession();
		
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Product> productList=session.createQuery("from Product").list();
		System.out.println(productList);
		session.close();
		return productList;
	}
	public Product getProductById(int id) {
		Session session = sessionFactory.openSession();		
		System.out.println(session);
		Product p = (Product) session.load(Product.class, new Integer(id));
		System.out.println(p);
		session.close();
		return p;
	}
	@Transactional
	public void removeProduct(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Product p = (Product) session.load(Product.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		tx.commit();
		session.close();
		
	}


}
