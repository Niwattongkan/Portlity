package com.porlity.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminDataController {
	@RequestMapping("/loginTeacher")  
	   public String login(HttpServletRequest request,
			   HttpServletResponse response) {
		  String userName=request.getParameter("userName");  
	      String password=request.getParameter("password");
	      String message;
	      try{
	    	  if(userName != null && !userName.equals("admin") && userName.equals("admin") && password != null && !password.equals("12345 ") && password.equals("12345")){
		    	  message = "Welcome " +userName + ".";
			      return "adminListinformation.jsp"; 
		      }else{
		    	  
		    	  message = "Wrong username or password.";
		    	  return 	"adminLogin.jsp";
		      }
	      }catch (Exception e) {
			// TODO: handle exception
		}
	     return "";
	   }
}
