package com.porlity.Controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.porlity.Service.UserService;
import com.porlity.entity.user;
import com.sun.org.apache.xpath.internal.operations.Mod;

@Controller
public class PortfolioController {
	@EJB(mappedName = "ejb:/PorlityClient//UserServiecBean!com.porlity.Service.UserService")
	UserService userser;
	
	@RequestMapping("/printPortfolio")
	public ModelAndView printPortfolio(HttpServletRequest request){
		ModelAndView mv = new ModelAndView("printPortfolio.jsp");
		HttpSession session=request.getSession(false);
		String userId = null;
		 if(session!=null){  
	        	userId = (String)session.getAttribute("userId"); 
	        	System.out.println("userId" + userId);
	        }
		List<user> listuser;
		try{
			listuser = userser.getfindbyID(Long.parseLong(userId));
			mv.addObject("listuser",listuser);
		}catch (Exception e) {
			// TODO: handle exception
		}
	
		return mv;
	}
	
		
}
