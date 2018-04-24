package com.porlity.Controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.porlity.Service.templateActivityService;
import com.porlity.Service.templatePortfolioService;
import com.porlity.entity.activity;
import com.porlity.entity.templateActivity;
import com.porlity.entity.templatePortfolio;

@Controller
public class AddTemplateController {
	 @EJB(mappedName = "ejb:/Portlity//templateActivityServiceBean!com.porlity.Service.templateActivityService")
	 templateActivityService temActivity;
	 
	 @EJB(mappedName = "ejb:/Portlity//templatePortfolioServiceBean!com.porlity.Service.templatePortfolioService")
	 templatePortfolioService temPortfolio;

	 @RequestMapping("/addTemplateActivity")
	 public ModelAndView addTemplateActivity(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("addTemplate.jsp");
		 String htmlBody = request.getParameter("htmlBody");
		 return mv;
	 }
	 @RequestMapping("/saveTemplateActivity")
	 @ResponseBody
	 public String saveTemplateActivity(@ModelAttribute("templateActivity") templateActivity templateActivity, BindingResult result,
				HttpServletRequest request) throws UnsupportedEncodingException {	
		 		request.setCharacterEncoding("UTF-8");
		 		String htmlBody = request.getParameter("htmlBody");
		 		System.out.println("htmlBody "+htmlBody);
		 	try{
		 		if( templateActivity.getTemplateActivityId() != 0 )
		 		{	templateActivity.setBodyHTML(htmlBody);
		 			temActivity.update(templateActivity);
		 			System.out.println(htmlBody);
		 			return "success";
		 		}else{
		 			templateActivity.setBodyHTML(htmlBody);
		 			temActivity.insert(templateActivity);
		 			return "success";
		 		}
		 	}catch (Exception e) {
				// TODO: handle exception
		 		System.out.println("try agarin");
		 		e.printStackTrace();
			}
		 return "";
	 }
	
	 @RequestMapping("/listTemplateActivity")
	 public ModelAndView listTemplateActivity (HttpServletRequest request) {
		 ModelAndView mv = new ModelAndView("activityAdd.jsp");
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
		 
	 @RequestMapping("/listTemplateActivityAdmin")
	 public ModelAndView listTemplateActivityadmin (HttpServletRequest request) {
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
	 @RequestMapping("/saveTemplatePortfolio")
	 @ResponseBody
	 public String saveTemplatePortfolio(@ModelAttribute("templatePortfolio") templatePortfolio templatePortfolio, BindingResult result,
				HttpServletRequest request) throws UnsupportedEncodingException {	 
		 		request.setCharacterEncoding("UTF-8");
		 		String htmlBody = request.getParameter("htmlBody");
		 		System.out.println("htmlBody"+htmlBody);
		 	try{
		 		if( templatePortfolio.getTemplatePortfolioId() != 0 )
		 		{	templatePortfolio.setBodyHTML(htmlBody);
		 			temPortfolio.update(templatePortfolio);
		 			return "success";
		 		}else{
		 			templatePortfolio.setBodyHTML(htmlBody);
		 			temPortfolio.insert(templatePortfolio);
		 			return "success";
		 		}
		 	}catch (Exception e) {
				// TODO: handle exception
		 		System.out.println("try agarin");
		 		e.printStackTrace();
			}
		 return "";
	 }
	 @RequestMapping("/deleteTemplate")
		public String removeTemplate(HttpServletRequest request) {
		 	
			long phoneid = Long.parseLong(request.getParameter("id"));
			temActivity.delete(phoneid);
			return "redirect:listTemplateActivityAdmin.do";
		}
	
}
