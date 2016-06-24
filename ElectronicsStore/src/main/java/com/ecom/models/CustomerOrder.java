package com.ecom.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="CustomerOrder")
public class CustomerOrder  implements Serializable {
	@Id
	@SequenceGenerator(name = "order_seq", sequenceName = "order_seq")
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "order_seq")
    private int orderId;
	
	@OneToOne
    @JoinColumn(name = "cartId")
    private Cart cart;

    @OneToOne
    @JoinColumn(name = "userId")
    private Customer usersDetail;

	
    @OneToOne
    @JoinColumn(name="shipId")
    private ShippingAddress shippingAddress;

    public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int userOrderId) {
		this.orderId = userOrderId;
	}

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }



    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    public Customer getUsersDetail() {
		return usersDetail;
	}

	public void setUsersDetail(Customer usersDetail) {
		this.usersDetail = usersDetail;
	}

}
