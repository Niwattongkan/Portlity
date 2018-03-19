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
import com.porlity.Service.UserService;
import com.porlity.entity.activity;
import com.porlity.entity.user;

@Controller
public class ActivityController {
	 @EJB(mappedName = "ejb:/Portlity//ActivityServiceBean!com.porlity.Service.ActivitySerice")
	 ActivitySerice activitySer;
	 @EJB(mappedName = "ejb:/Portlity//UserServiecBean!com.porlity.Service.UserService")
		UserService userser; 
	 
	
	 @RequestMapping("/addActivity")
	 public ModelAndView addActivity(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("activityAdd.jsp");
		 String htmlBody = request.getParameter("htmlValue");
		 return mv;
	 }
	 @RequestMapping("/saveActivity")
	 public String saveActivity(@ModelAttribute("activity") activity activity, BindingResult result,
				HttpServletRequest request) {	 
		 String htmlBody = request.getParameter("htmlValue");
		 String ActivityId = Long.toString(activity.getActivityId());
		 String userId = (String) request.getSession().getAttribute("userId");
		 user user = userser.findUser(Long.parseLong(userId));
		 	try{
		 		if(ActivityId != null )
		 		{	activity.setUser(user);
		 			activity.setPage(htmlBody);
		 			activitySer.update(activity);
		 			System.out.println("update activity " + activity.getActivityId());
		 			return "listActivity.do";
		 		}else{
		 			activity.setUser(user);
		 			activity.setPage(htmlBody);
		 			activitySer.insert(activity);
		 			System.out.println("insert activit y" + ActivityId);
		 			return "listActivity.do";
		 		}
		 	}catch (Exception e) {
				// TODO: handle exception
		 		System.out.println("try agarin");
		 		e.printStackTrace();
			}
		 return "listActivity.do";
	 }
	 @RequestMapping("/listActivity")
	 public ModelAndView listActivity(HttpServletRequest request){
		 HttpSession session=request.getSession(false);
	        String userId = null;
	        if(session!=null){  
	        	userId = (String)session.getAttribute("userId"); 
	        }
	        	System.out.println("userId " + userId);
    	ModelAndView mv  = new ModelAndView("activityList.jsp");
//    	List<activity> activtyList;
//		try {
//			activtyList = activitySer.findIdStudent(Long.parseLong(userId));
//			mv.addObject("activtyList",activtyList);
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//	 }
		return mv;
}
}
