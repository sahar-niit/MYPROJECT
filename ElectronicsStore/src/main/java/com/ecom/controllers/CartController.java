package com.ecom.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.models.Cart;
import com.ecom.models.CartItem;
import com.ecom.models.Customer;
import com.ecom.models.Product;
import com.ecom.services.CartItemService;
import com.ecom.services.CustomerServices;
import com.ecom.services.ProductServices;





@RestController

public class CartController {
	

    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private CustomerServices usersDetailService;

    @Autowired
    private ProductServices itemService;
    @RequestMapping("/refreshCart")
    public Cart getCartById (Principal principal) {
    	Customer usersDetail = usersDetailService.getUserByUsername(principal.getName());
    	System.out.println("cart id:"+ usersDetail.getCustName());
        Cart cart = usersDetail.getCart();
        return cart;
    }

    

      /*
     * addItem method is used to add a item in user cart.
     */

    @RequestMapping(value = "/addItem/{itemId}", method = RequestMethod.PUT)
   @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addItem (@PathVariable("itemId") int itemId, Principal principal) {

    	System.out.println("add"+ itemId);
    	
    	Customer usersDetail = usersDetailService.getUserByUsername(principal.getName());
    	System.out.println("cart id:"+ usersDetail.getCustName());
        Cart cart = usersDetail.getCart();
        System.out.println("cart id:"+ cart.getCartId());
        Product item = itemService.getProductById(itemId);
        System.out.println("Product:"+ item.getName());
        List<CartItem> cartItems = cart.getCartItems();
        System.out.println("cart item size:"+ cartItems.size());
        for (int i=0; i<cartItems.size(); i++) {
            if(item.getPid()==cartItems.get(i).getItem().getPid()){
                CartItem cartItem = cartItems.get(i);
                cartItem.setQuantity(cartItem.getQuantity()+1);
                cartItem.setTotalPrice(item.getPrice()*cartItem.getQuantity());
                cartItemService.addCartItem(cartItem);

                return;
            }
        }

        CartItem cartItem = new CartItem();
        cartItem.setItem(item);
        cartItem.setQuantity(1);
        cartItem.setTotalPrice(item.getPrice()*cartItem.getQuantity());
        cartItem.setCart(cart);
        cartItemService.addCartItem(cartItem);
    }
    /*
     * removeItem method is used to remove a item from user cart.
     */
    @RequestMapping(value = "/removeItem/{itemId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeItem (@PathVariable("itemId") int itemId) {
    	System.out.println("Deleting item Id: "+itemId);
        CartItem cartItem = cartItemService.getCartItemByItemId(itemId);
        cartItemService.removeCartItem(cartItem);

    }
    
   
    /*
     * clearCartItems method is used to remove all items from user cart.
     */
    @RequestMapping(value = "/clearCartItems", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void clearCartItems(Principal principal) {
    	
    	Customer usersDetail = usersDetailService.getUserByUsername(principal.getName());
    	System.out.println("cart id:"+ usersDetail.getCustName());
        Cart cart = usersDetail.getCart();
        
        cartItemService.removeAllCartItems(cart);
    }
    /*
     * ExceptionHandler for client errors.
     */
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, please verify your payload.")
    public void handleClientErrors (Exception e) {}
    /*
     * ExceptionHandler for server errors.
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error.")
    public void handleServerErrors (Exception e) {}
	

}
