package com.ecom.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="CardDetails")
public class CardDetails  implements Serializable {

	@Id
	@SequenceGenerator(name = "ship_seq", sequenceName = "ship_seq")
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "ship_seq")
	@Column(name="cardId")
    private int cardID;
	
	@NotEmpty (message = "Please select card type.")
	@Column(name="cardtype")
    private String cardType;
	
	@NotEmpty (message = "The card number must not be null.")
	@Column(name="cardNumber")
    private String cardNumber;

    @NotEmpty (message = "Please select expiry month.")
    @Column(name="expiryMonth")
    private String expiryMonth;

	@NotEmpty (message = "Please select expiry year.")
	 @Column(name="expiryYear")
    private String expiryYear;

    @NotEmpty (message = "The CVV2/CVC2 number must not be null.")
    @Column(name="cvNumber")
    private String cvNumber;

    @NotEmpty (message = "The name must not be null.")
    @Column(name="nameOnCard")
    private String nameOnCard;
    
    @NotEmpty (message = "The ATM pin must not be null.")
    @Column(name="atmPin")
    private String atmPin;
    
    @ManyToOne
    @JoinColumn(name = "cartId")
    @JsonIgnore
    private Cart cart;
    
    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonIgnore
    private Customer usersDetail;
    
    
   
    @Column(name="totalCost")
	private double totalCost;
    
	

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public int getCardID() {
		return cardID;
	}

	public void setCardID(int cardID) {
		this.cardID = cardID;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvNumber() {
		return cvNumber;
	}

	public void setCvNumber(String cvNumber) {
		this.cvNumber = cvNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(String atmPin) {
		this.atmPin = atmPin;
	}
	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getCardType() {
			return cardType;
	}

	public void setCardType(String cardType) {
			this.cardType = cardType;
	}
	
	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
	
	 public Customer getUsersDetail() {
			return usersDetail;
	}

	public void setUsersDetail(Customer usersDetail) {
			this.usersDetail = usersDetail;
	}


}
