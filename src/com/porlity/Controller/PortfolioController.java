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

import com.porlity.Service.PortfolioService;
import com.porlity.Service.UserService;
import com.porlity.entity.portfolio;
import com.porlity.entity.user;

@Controller
public class PortfolioController {
	@EJB(mappedName = "ejb:/Portlity//UserServiecBean!com.porlity.Service.UserService")
	UserService userser;
	@EJB(mappedName = "ejb:/Portlity//PortfolioServiceBean!com.porlity.Service.PortfolioService")
	PortfolioService portfolioser;
			
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
	
	@RequestMapping("/listPortfolio")
	public ModelAndView listPortfolio(HttpServletRequest request){
		String userId = null;
		ModelAndView mv = new ModelAndView("activityList.jsp");
		HttpSession session=request.getSession(false);
		if(session!=null){
			userId = (String)session.getAttribute("userId");
			System.out.println("USER ID PORTFOLIO "+userId);
		}
		List<portfolio> listPort;
		try{
			listPort = portfolioser.getPortfoliofindbyUserId(userId);
			mv.addObject("listPort",listPort);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return mv;
	}
	@RequestMapping("/newPortfilio")
	public ModelAndView newPortfolio (HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("activityAdd.jsp");
		String userId = (String) request.getSession().getAttribute("userId");
		user user = userser.findUser(Long.parseLong(userId));
		portfolio Portfolio = new portfolio();
		Portfolio.setUser(user);
		mv.addObject("Portfolio",Portfolio);
		return mv;
	}
	@RequestMapping("/savePortfolio")
	public String savePortfolio(@ModelAttribute("Portfolio") portfolio Portfolio,BindingResult result,
			HttpServletRequest request) {
		try {
			System.out.println(Portfolio.getClass());
			if(Portfolio.getPortfolioID() == 0) {
				portfolioser.insert(Portfolio);
			}else{
				portfolioser.update(Portfolio);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:listPortfolio.do";
	}
	
}
