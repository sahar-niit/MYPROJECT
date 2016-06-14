package Com.Ecomm.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller


public class MyController   {
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
	public ModelAndView displayPage(@RequestParam("prd") String prd)
	{
		 return new ModelAndView("Display", "prd", prd);  
		
	
	}

	

	

}
