package com.ecom.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




@Entity
@Table(name="ShippingAddress")
public class ShippingAddress implements Serializable {
	@Id
	@SequenceGenerator(name = "ship_seq", sequenceName = "ship_seq")
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "ship_seq")
	@Column(name="ShipId")
	private int shipId;
	@Column(name="House_no")
	private String houseNumber;
	@Column(name="addressLine1")
    private String addressLine1;
	@Column(name="addressLine2")
    private String addressLine2;
	@Column(name="city")
    private String city;
	@Column(name="state")
    private String state;
	@Column(name="country")
    private String country;
	@Column(name="zipcode")
    private String zipCode;

    @OneToOne
    @JoinColumn(name="custid")
    private Customer usersDetail;
    

	public int getShipId() {
        return shipId;
    }

    public void setShipId(int shippingAddressId) {
        this.shipId = shippingAddressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
	public Customer getUsersDetail() {
		return usersDetail;
	}

	public void setUsersDetail(Customer usersDetail) {
		this.usersDetail = usersDetail;
	}

/*	@Override
	public String toString() {
		return "ShippingAdd [shippingAddressId=" + shipId + ", houseNumber=" + houseNumber
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", state="
				+ state + ", country=" + country + ", zipCode=" + zipCode + ", Customer=" + usersDetail + "]";
	} */


}
