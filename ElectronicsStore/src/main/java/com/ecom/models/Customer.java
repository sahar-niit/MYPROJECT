package com.ecom.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CustID")
	int custId;
	
	@Column(name="Pname")
	@NotBlank
	String custName;
	@NotBlank
	@Column(name="UserName")
	String username;
	@Email
	@Column(name="Email",unique=true)
	@NotBlank
	String email;
	@Column(name="Password")
	@NotBlank
	String password;
	@Column(name="Phone")
	@NotBlank
	String phone;
	@Column(name="Address")
	@NotBlank
	String address;
	
	public void setCustId(int c)
	{
		custId=c;
	}
	public int getCustId()
	{
		return custId;
	}
	public void setCustName(String nm)
	{
		custName= nm;
	}
	public String getCustName()
	{
		return custName;
	}
	public void setEmail(String em)
	{
		email= em;
	}
	public String getEmail()
	{
		return email;
	}
	public void setPassword(String ps)
	{
		password= ps;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setphone(String ph)
	{
		phone= ph;
	}
	public String getPassword()
	{
		return password;
	}
	
	public void setAddress(String ad)
	{
		address= ad;
	}
	public String getAddress()
	{
		return address;
	}
	
	
	public void setUsername(String aus)
	{
		username= aus;
	}
	public String getUsername()
	{
		return username;
	}

}
