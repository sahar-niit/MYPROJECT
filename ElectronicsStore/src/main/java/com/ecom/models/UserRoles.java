package com.ecom.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserRoles")
public class UserRoles {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UID")
	private int uid;
	@Column(name="username")
	String username;
	@Column(name="password")
	String password;
	@Column(name="authority")
	String authority;
	@Column(name="enabled")
	int enabled;
	
	public void setUsername(String nm)
	{
		username=nm;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setPassword(String nm)
	{
		password=nm;
	}
	
	public String getPassword()
	{
		return password;
	}

	public void setAuthority(String nm)
	{
		authority=nm;
	}
	
	public String getAuthority()
	{
		return authority;
	}

	public void setEnabled(int x)
	{
		enabled=x;
	}
	
	public int  getEnabled()
	{
		return enabled;
	}
	

}
