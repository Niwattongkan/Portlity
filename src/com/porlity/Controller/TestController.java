package com.porlity.Controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.porlity.Service.ActivitySerice;
import com.porlity.Service.PortfolioService;
import com.porlity.Service.UserService;
import com.porlity.Service.templateActivityService;
import com.porlity.entity.activity;
import com.porlity.entity.templateActivity;

@Controller
public class TestController {
	@EJB(mappedName = "ejb:/Portlity//templateActivityServiceBean!com.porlity.Service.templateActivityService")
	 templateActivityService temActivity;
	 @EJB(mappedName = "ejb:/Portlity//UserServiecBean!com.porlity.Service.UserService")
		UserService userser; 
	 @EJB(mappedName = "ejb:/Portlity//PortfolioServiceBean!com.porlity.Service.PortfolioService")
	 	PortfolioService portser;
	
	 @RequestMapping("/listTemplateActivityOfSuperAdmin")
	 public ModelAndView listTemplateActivityOfSuperAdmin(HttpServletRequest request) {
		 ModelAndView mv = new ModelAndView("addTemplateActivity.jsp");
		 templateActivity tem = new templateActivity();
		 List<templateActivity> temActivityList;
		 try{
			 temActivityList = temActivity.getAll();
			 mv.addObject("temActivityList",temActivityList);
			 }catch (Exception e) {
			// TODO: handle exception
		}
		 return mv; 
	 }
	 
	 @RequestMapping("/deleteTemplateActivity")
	 public String deleteTemplateActivity(HttpServletRequest request) {
		 temActivity.delete(Long.valueOf(request.getParameter("id")));
			return "redirect:listTemplateActivityOfSuperAdmin.do";
		}
}
