package com.ecom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.dao.CartDAO;
import com.ecom.models.Cart;


@Service
public class CartService {
	  @Autowired
	    private CartDAO cartDao;

	    public Cart getCartById(int cartId) {
	        return cartDao.getCartById(cartId);
	    }

	    public void update(Cart cart) {
	        cartDao.update(cart);
	    }

}
