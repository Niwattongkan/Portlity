package com.porlity.Controller;

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
import com.porlity.entity.activity;
import com.porlity.entity.templateActivity;

@Controller
public class AddTemplateController {
	 @EJB(mappedName = "ejb:/Portlity//templateActivityServiceBean!com.porlity.Service.templateActivityService")
	 templateActivityService temActivity;

	 @RequestMapping("/addTemplateActivity")
	 public ModelAndView addTemplateActivity(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("addTemplate.jsp");
		 String htmlBody = request.getParameter("htmlBody");
		 return mv;
	 }
	 @RequestMapping("/saveTemplateActivity")
	 @ResponseBody
	 public String saveTemplateActivity(@ModelAttribute("templateActivity") templateActivity templateActivity, BindingResult result,
				HttpServletRequest request) {	 
		 		String htmlBody = request.getParameter("htmlBody");
		 		System.out.println("htmlBody"+htmlBody);
		 	try{
		 		if( templateActivity.getTemplateActivityId() != 0 )
		 		{	templateActivity.setBodyHTML(htmlBody);
		 			temActivity.update(templateActivity);
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
	
	 @RequestMapping("/listTemplateActivity.do")
	 public ModelAndView listTemplateActivity (HttpServletRequest request) {
		 ModelAndView mv = new ModelAndView("activityAdd.jsp");
		 templateActivity tem = new templateActivity();
		 if(tem.getTemplateActivityId() != 0){
			 System.out.println(tem.getTemplateActivityId());
		 }
		 List<templateActivity> temActivityList;
		 try{
			 temActivityList = temActivity.gettemplateActivty(tem.getTemplateActivityId());
			 mv.addObject("temActivityList",temActivityList);
			 }catch (Exception e) {
			// TODO: handle exception
		}
		 return mv;
		 
	 }
}
