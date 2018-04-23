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
		 ModelAndView mv = new ModelAndView("portfolioPrintInformationTechnology.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio")
	 public ModelAndView listDataofUser(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio.do");
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
	 @RequestMapping("/listActivityForPortfolio2")
	 public ModelAndView listActivity2(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintAgroIndustry.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio2")
	 public ModelAndView listDataofUser2(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio2.do");
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
	 @RequestMapping("/listActivityForPortfolio3")
	 public ModelAndView listActivity3(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintChineseStudies.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio3")
	 public ModelAndView listDataofUser3(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio3.do");
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
	 @RequestMapping("/listActivityForPortfolio4")
	 public ModelAndView listActivity4(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintCosmeticScience.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio4")
	 public ModelAndView listDataofUser4(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio4.do");
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
	 @RequestMapping("/listActivityForPortfolio5")
	 public ModelAndView listActivity5(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintDentistry.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio5")
	 public ModelAndView listDataofUser5(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio5.do");
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
	 @RequestMapping("/listActivityForPortfolio6")
	 public ModelAndView listActivity6(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintHealthSciences.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio6")
	 public ModelAndView listDataofUser6(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio6.do");
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
	 @RequestMapping("/listActivityForPortfolio7")
	 public ModelAndView listActivity7(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintLaw.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio7")
	 public ModelAndView listDataofUser7(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio7.do");
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
	 @RequestMapping("/listActivityForPortfolio8")
	 public ModelAndView listActivity8(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintLiberalArts.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio8")
	 public ModelAndView listDataofUser8(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio8.do");
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
	 @RequestMapping("/listActivityForPortfolio9")
	 public ModelAndView listActivity9(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintManagement.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio9")
	 public ModelAndView listDataofUser9(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio9.do");
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
	 @RequestMapping("/listActivityForPortfolio10")
	 public ModelAndView listActivity10(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintMedicine.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio10")
	 public ModelAndView listDataofUser10(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio10.do");
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
	 @RequestMapping("/listActivityForPortfolio11")
	 public ModelAndView listActivity11(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintNurse.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio11")
	 public ModelAndView listDataofUser11(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio11.do");
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
	 @RequestMapping("/listActivityForPortfolio12")
	 public ModelAndView listActivity12(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintScience.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio12")
	 public ModelAndView listDataofUser12(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio12.do");
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
	 @RequestMapping("/listActivityForPortfolio13")
	 public ModelAndView listActivity13(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintSocialInnovation.jsp");
			HttpSession session=request.getSession(false);
			String userId = null;
			activity activi = new activity();
			if(session!=null){  
		        	userId = (String)session.getAttribute("userId"); 
		        	System.out.println("userId" + userId);
		     
		        }
			List<activity> listActivity;
			
			try{
				listActivity = activitySer.getfindbyuserID(Long.parseLong(userId));
				System.out.println("id activity"+activi.getActivityId());
				mv.addObject("listActivity",listActivity);
			}catch (Exception e) {
				// TODO: handle exception
			}
		return mv;
	 }
	 @RequestMapping("/printPortfolio13")
	 public ModelAndView listDataofUser13(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio13.do");
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
