package Com.Ecomm.mymodels;

import java.util.ArrayList;

public class ProductModel {
	static ArrayList<Product> list= new ArrayList<Product>();
	public ProductModel()
	{
		list.add(new Product(101,"Samsung J7",10,14000,"4 GB RAM,32 GB Internal Memory","Mobiles","J7.jpg" ));
		list.add(new Product(102,"Iphone",5,60000,"4 GB RAM,16 GB Internal Memory","Mobiles","Iphone.jpg" ));
		list.add(new Product(103,"Samsung Laptop",4,35000,"4 GB RAM,1 TB Internal Memory","Laptops","samsung.jpg" ));
		list.add(new Product(104,"Dell Laptop",10,34000,"4 GB RAM,500 GB Internal Memory","Laptops","dell.jpg" ));
		list.add(new Product(105,"Sony Camera",15,15000,"32 GB Internal Memory, Flash","Cameras","sony.jpg" ));
		list.add(new Product(106,"Canon Camera",20,16000,"16 GB Internal Memory Digicam,Auto Focus","Cameras","canon.jpg" ));
		list.add(new Product(107,"Nikon Camera",30,7000,"8  GB Internal Memory, Light Weight","Cameras","nikon.jpg" ));
	
	}
	public ArrayList<Product> getByCategory(String cat)
	{
		ArrayList<Product> catPrd = new ArrayList<Product>();
		for (Product product : list) {
			if(product.getCategory().equals(cat))
			{
				catPrd.add(product);
			}
			
			
		}
		return catPrd;
	}
	public ArrayList<Product> getAllProduct()
	{
		return list;
	}

}
