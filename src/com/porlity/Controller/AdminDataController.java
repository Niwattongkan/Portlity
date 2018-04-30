package com.porlity.Controller;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.porlity.Service.AdmidService;
import com.porlity.entity.admin;

@Controller
public class AdminDataController {
	
	@EJB(mappedName = "ejb:/Portlity//AdmidServiceBean!com.porlity.Service.AdmidService")
	AdmidService AdmidServ;
	@RequestMapping("/loginTeacher")  
	   public String login(HttpServletRequest request,@ModelAttribute("admin") admin admin,
			   HttpServletResponse response) {
		  String userName=request.getParameter("userName");  
	      String password=request.getParameter("password");
	      
	      try{
	    	  if(AdmidServ.getfindbyadminUsername(userName) != null && AdmidServ.getfindbyadminUsername(password)!=null){
		    	  
			      return "sucess"; 
		      }else{
		    	  
		    	 
		    	  return 	"not pass";
		      }
	      }catch (Exception e) {
			// TODO: handle exception
		}
	     return "";
	   }
	@RequestMapping("/Newadmin")  
	public ModelAndView Newadmin() {
		ModelAndView mv = new ModelAndView("Registration.jsp");
		admin ad = new admin();
		mv.addObject( "ad",ad);
		return null;
		
	}
	@RequestMapping("/Saveadmin")
	public String saveEmp(@ModelAttribute("admin") admin admin, BindingResult result,
			HttpServletRequest request) {
		// System.out.println("saving "+employee.getFirstname()+"
		// "+employee.getLastname());
		try {
			// employee is not existed, meaning it's new employee
			if (admin.getAdminId() == 0) {
				
				AdmidServ.insert(admin);
				// employee is existed
			} else {
				
				AdmidServ.update(admin);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:adminLogin.jsp";
	}
	
	
	
}
