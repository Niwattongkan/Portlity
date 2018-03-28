package com.porlity.Controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.porlity.Service.ActivitySerice;
import com.porlity.Service.PortfolioService;
import com.porlity.Service.UserService;
import com.porlity.entity.activity;
import com.porlity.entity.portfolio;
import com.porlity.entity.user;

@Controller
public class PortfolioController {
	 @EJB(mappedName = "ejb:/Portlity//ActivityServiceBean!com.porlity.Service.ActivitySerice")
	 ActivitySerice activitySer;
	 @EJB(mappedName = "ejb:/Portlity//UserServiecBean!com.porlity.Service.UserService")
		UserService userser; 
	 @EJB(mappedName = "ejb:/Portlity//PortfolioServiceBean!com.porlity.Service.PortfolioService")
	 	PortfolioService portser;
	 
	 @RequestMapping("/listActivityForPortfolio")
	 public ModelAndView listActivity(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrint.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			 if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 
	 
}
