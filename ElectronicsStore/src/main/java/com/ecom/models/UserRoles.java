package com.ecom.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="UserRoles")
public class UserRoles  {
	@Id
	@SequenceGenerator(name = "user_seq", sequenceName = "user_seq")
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "user_seq")
	@Column(name="UID")
	private int uid;
	
	@Column(name="authority")
	String authority;
  
	@Column(name="custId")
	int custId;

	public void setCustId(int cid)
	{
		custId=cid;
	}
	public int getCustId()
	{
		return custId;
	}

	public void setUid(int id)
	{
		uid=id;
	}
	public int getUid()
	{
		return uid;
	}

	public void setAuthority(String nm)
	{
		authority=nm;
	}
	
	public String getAuthority()
	{
		return authority;
	}

	
	

}
