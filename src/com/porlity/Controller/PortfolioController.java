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
	 @RequestMapping("/listActivityForPortfolio14")
	 public ModelAndView listActivity14(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintInformationTechnologyComputerEngineering.jsp");
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
	 @RequestMapping("/printPortfolio14")
	 public ModelAndView listDataofUser14(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio14.do");
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
	 @RequestMapping("/listActivityForPortfolio15")
	 public ModelAndView listActivity15(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintInformationTechnologycoverComputerScienceandInnovation.jsp");
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
	 @RequestMapping("/printPortfolio15")
	 public ModelAndView listDataofUser15(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio15.do");
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
	 @RequestMapping("/listActivityForPortfolio16")
	 public ModelAndView listActivity16(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintAgroIndustrycoverFoodTechnology.jsp");
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
	 @RequestMapping("/printPortfolio16")
	 public ModelAndView listDataofUser16(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio16.do");
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
	 @RequestMapping("/listActivityForPortfolio17")
	 public ModelAndView listActivity17(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintAgroIndustry2.jsp");
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
	 @RequestMapping("/printPortfolio17")
	 public ModelAndView listDataofUser17(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio17.do");
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
	 @RequestMapping("/listActivityForPortfolio18")
	 public ModelAndView listActivity18(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView(" ");
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
	 @RequestMapping("/printPortfolio18")
	 public ModelAndView listDataofUser18(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio18.do");
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
	 @RequestMapping("/listActivityForPortfolio19")
	 public ModelAndView listActivity19(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintChineseStudiescoverBusinesschinese.jsp");
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
	 @RequestMapping("/printPortfolio19")
	 public ModelAndView listDataofUser19(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio19.do");
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
	 @RequestMapping("/listActivityForPortfolio20")
	 public ModelAndView listActivity20(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintChineseStudies2.jsp");
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
	 @RequestMapping("/printPortfolio20")
	 public ModelAndView listDataofUser20(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio20.do");
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
	 @RequestMapping("/listActivityForPortfolio21")
	 public ModelAndView listActivity21(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintCosmeticSciencecoverBeautyTechnology.jsp");
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
	 @RequestMapping("/printPortfolio21")
	 public ModelAndView listDataofUser21(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio21.do");
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
	 @RequestMapping("/listActivityForPortfolio22")
	 public ModelAndView listActivity22(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintCosmeticScience2.jsp");
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
	 @RequestMapping("/printPortfolio22")
	 public ModelAndView listDataofUser22(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio22.do");
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
	 @RequestMapping("/listActivityForPortfolio23")
	 public ModelAndView listActivity23(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintDentistry2.jsp");
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
	 @RequestMapping("/printPortfolio23")
	 public ModelAndView listDataofUser23(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio23.do");
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
	 @RequestMapping("/listActivityForPortfolio24")
	 public ModelAndView listActivity24(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintDentistry3.jsp");
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
	 @RequestMapping("/printPortfolio24")
	 public ModelAndView listDataofUser24(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio24.do");
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
	 @RequestMapping("/listActivityForPortfolio25")
	 public ModelAndView listActivity25(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintHealthSciences2.jsp");
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
	 @RequestMapping("/printPortfolio25")
	 public ModelAndView listDataofUser25(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio25.do");
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
	 @RequestMapping("/listActivityForPortfolio26")
	 public ModelAndView listActivity26(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintHealthSciencescoverTraditionalChineseMedicine.jsp");
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
	 @RequestMapping("/printPortfolio26")
	 public ModelAndView listDataofUser26(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio26.do");
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
	 @RequestMapping("/listActivityForPortfolio27")
	 public ModelAndView listActivity27(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintLaw2.jsp");
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
	 @RequestMapping("/printPortfolio27")
	 public ModelAndView listDataofUser27(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio27.do");
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
	 @RequestMapping("/listActivityForPortfolio28")
	 public ModelAndView listActivity28(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintLaw3.jsp");
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
	 @RequestMapping("/printPortfolio28")
	 public ModelAndView listDataofUser28(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio28.do");
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
	 @RequestMapping("/listActivityForPortfolio29")
	 public ModelAndView listActivity29(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintLiberalArts2.jsp");
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
	 @RequestMapping("/printPortfolio29")
	 public ModelAndView listDataofUser29(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio29.do");
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
	 @RequestMapping("/listActivityForPortfolio30")
	 public ModelAndView listActivity30(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintLiberalArts2.jsp");
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
	 @RequestMapping("/printPortfolio30")
	 public ModelAndView listDataofUser30(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio30.do");
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
	 @RequestMapping("/listActivityForPortfolio31")
	 public ModelAndView listActivity31(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintManagementcoverAviationBusinessManagement.jsp");
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
	 @RequestMapping("/printPortfolio31")
	 public ModelAndView listDataofUser31(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio31.do");
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
	 @RequestMapping("/listActivityForPortfolio32")
	 public ModelAndView listActivity32(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintManagement2.jsp");
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
	 @RequestMapping("/printPortfolio32")
	 public ModelAndView listDataofUser32(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio32.do");
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
	 @RequestMapping("/listActivityForPortfolio33")
	 public ModelAndView listActivity33(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintMedicine2.jsp");
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
	 @RequestMapping("/printPortfolio33")
	 public ModelAndView listDataofUser33(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio33.do");
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
	 @RequestMapping("/listActivityForPortfolio34")
	 public ModelAndView listActivity34(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintMedicine3.jsp");
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
	 @RequestMapping("/printPortfolio34")
	 public ModelAndView listDataofUser34(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio34.do");
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
	 @RequestMapping("/listActivityForPortfolio35")
	 public ModelAndView listActivity35(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintNurse2.jsp");
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
	 @RequestMapping("/printPortfolio35")
	 public ModelAndView listDataofUser35(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio35.do");
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
	 @RequestMapping("/listActivityForPortfolio36")
	 public ModelAndView listActivity36(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintNurse3.jsp");
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
	 @RequestMapping("/printPortfolio36")
	 public ModelAndView listDataofUser36(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio36.do");
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
	 @RequestMapping("/listActivityForPortfolio37")
	 public ModelAndView listActivity37(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintSciencecoverBiosciences.jsp");
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
	 @RequestMapping("/printPortfolio37")
	 public ModelAndView listDataofUser37(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio37.do");
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
	 @RequestMapping("/listActivityForPortfolio38")
	 public ModelAndView listActivity38(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintSciencecoverMaterialEngineering.jsp");
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
	 @RequestMapping("/printPortfolio38")
	 public ModelAndView listDataofUser38(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio38.do");
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
	 @RequestMapping("/listActivityForPortfolio39")
	 public ModelAndView listActivity39(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintSocialInnovation2.jsp");
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
	 @RequestMapping("/printPortfolio39")
	 public ModelAndView listDataofUser39(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio39.do");
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
	 @RequestMapping("/listActivityForPortfolio40")
	 public ModelAndView listActivity40(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("portfolioPrintSocialInnovation3.jsp");
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
	 @RequestMapping("/printPortfolio40")
	 public ModelAndView listDataofUser40(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("listActivityForPortfolio40.do");
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