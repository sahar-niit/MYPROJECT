package Com.Ecomm.mycontroller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import Com.Ecomm.mymodels.Product;
import Com.Ecomm.services.ProductServiceImpl;


@Controller
public class ProductsController   {

	@Autowired
	private ProductServiceImpl ss;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	  public String indexPage() {
	     
	      return "index";
	   }
	
	@RequestMapping(value="/About",method=RequestMethod.GET)
	public String aboutPage(){
		return "AboutUs";
	}
	
	@RequestMapping(value="/Contact",method=RequestMethod.GET)
	public String contactPage(){
		return "ContactUs";
	
	}
	@RequestMapping(value="/Register",method=RequestMethod.GET)
	public String registerPage(){
		return "Register";
	}
	
	@RequestMapping(value="/disp",method=RequestMethod.GET)
	public ModelAndView displayPage(@RequestParam("prd") String prd){
		return new ModelAndView("Display","prd",prd);
	}

	@RequestMapping(value="/prod",method=RequestMethod.GET)
	public @ResponseBody List<Product> getData()
	{
		
			return ss.listProducts();
			
			
				
	
	}
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String DetailsPage(){
		return "ProductDetails";
	}
	@RequestMapping(value="/success",method=RequestMethod.GET)
	public String SuccessPage(){
		return "success";
	}
	@RequestMapping(value="/error",method=RequestMethod.GET)
	public String ErrorPage(){
		return "error";
	}

	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView editPage(@RequestParam("id") String id){
		int x = Integer.parseInt(id);
		
		Product p = ss.getProductById(x);
		System.out.println(p);
		return new ModelAndView("Edit","products",p);
	}
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	public String editActionPage(@ModelAttribute("products") Product p ,BindingResult result, Model model){
	//	try{ 
		System.out.println(p.getId());
		
			ss.updateProduct(p);
			
	//	}
	//	catch(Exception e)
	//	{
	//		return "error";
	//	}
		return "Display";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deletePage(){
		return "Delete";
	}
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String deleteActionPage(@RequestParam("id") String id){
		
		int x = Integer.parseInt(id);
		
		ss.removeProduct(x);
		return "Display";
	}


	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView  addPage(  ){
		
		
		return new ModelAndView("Add", "product",new Product());
	}

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addActionPage(@ModelAttribute("product") Product p ,BindingResult result, Model model){
		try{
			
		
			
		ss.addProduct(p);
		
		
		}
		catch(Exception ex)
		{
			return "error";
		}
		return "success";
	}

	

}
