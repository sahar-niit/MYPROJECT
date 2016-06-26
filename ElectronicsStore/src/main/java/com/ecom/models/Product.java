package com.ecom.models;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Product implements Serializable {
	
	@Id
	@SequenceGenerator(name = "prod_seq", sequenceName = "prod_seq")
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "prod_seq")
	
	@Column(name="PID")
	private int pid;
	@NotNull
	@Size(min=3,max=40)
	@Column(name="PNAME")
	private String name;
	@Min(1)
	@Column(name="PRICE")
	private double price;
	@Min(1)
	@Column(name="Quantity")
	private int qty;
	@Column(name="Category")
	private String category;
	
	@Column(name="ImagePath")
	private String image;
	@NotBlank
	@Column(name="Description")
	private String description;
	@NotNull
	@Transient
	private MultipartFile file;
    
	
	public void setPid(int id)
	{
		this.pid= id;
	}
	public int getPid()
	{
		return pid;
	}
	
    public MultipartFile getFile() {
        return file;
    }
 
    public void setFile(MultipartFile file) {
        this.file = file;
    }
	
	public Product(){}
	
	public void setName(String name)
	{
		this.name= name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(double Price)
	{
		this.price= Price;
	}
	public double  getPrice()
	{
		return price;
	}
	public void setQty(int qty)
	{
		this.qty= qty;
	}
	public int getQty()
	{
		return qty;
	}
	public void setCategory(String cat)
	{
		this.category= cat;
	}
	public String getCategory()
	{
		return category;
	}
	public void setImage(String image)
	{
		this.image= image;
	}
	public String getImage()
	{
		return image;
	}
	public void setDescription(String desc)
	{
		this.description= desc;
	}
	public String getDescription()
	{
		return description;
	}

	
}
