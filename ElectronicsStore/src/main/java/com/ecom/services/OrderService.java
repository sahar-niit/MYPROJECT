package com.ecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.dao.OrderDAO;
import com.ecom.models.Cart;
import com.ecom.models.CartItem;
import com.ecom.models.CustomerOrder;



@Service
public class OrderService {

	 @Autowired
	    private OrderDAO orderDao;

	    @Autowired
	    private CartService cartService;

	    public void addOrder(CustomerOrder userOrder) {
	    	orderDao.addOrder(userOrder);
	    }

	    public double getOrderGrandTotal(int cartId) {
	        double grandTotal=0;
	        Cart cart = cartService.getCartById(cartId);
	        List<CartItem> cartItems = cart.getCartItems();

	        for (CartItem item : cartItems) {
	            grandTotal+=item.getTotalPrice();
	        }

	        return grandTotal;
	    }

}
