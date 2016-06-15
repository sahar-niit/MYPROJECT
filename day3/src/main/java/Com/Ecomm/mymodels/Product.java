package Com.Ecomm.mymodels;

public class Product {
private	int id;
private	String name;
private	int qty;
private	int price;
private	String description;
private	String category;
private String image;

public Product(){}
public Product(int id, String name,int qty,int price, String desc, String cat,String image)
{
	this.id =id;
	this.name =name;
	this.qty =qty;
	this.price =price;
	this.description=desc;
	this.category =cat;
	this.image=image;
	
}

public void setId(int id){
	this.id =id;
}
public void setName(String name){
	this.name =name;
}
public void setQty(int qty){
	this.qty =qty;
}
public void setPrice(int price){
	this.price =price;
}
public void setDescription(String desc){
	this.description=desc;
}
public void setCategory(String cat){
	this.category =cat;
}
public void setImage(String img){
	this.category =img;
}
public int getId()
{
	return id;
}
public String getName()
{
	return name;
}
public int getQty()
{
	return qty;
}
public int getPrice()
{
	return price;
}
public String getDescription()
{
	return description;
}
public String getCategory()
{
	return category;
}
public String getImage()
{
	return image;
}
}
