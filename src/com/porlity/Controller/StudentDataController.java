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

import com.porlity.Service.UserService;
import com.porlity.entity.user;

@Controller
public class StudentDataController {
	@EJB(mappedName = "ejb:/PorlityClient//UserServiecBean!com.porlity.Service.UserService")
	UserService userser;
	
	@RequestMapping("/listDataOfStudent")
	public ModelAndView listDataOfStudent (HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("studentProfile.jsp");
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
	@RequestMapping("/saveDataOfStudent")
	public String savePersonal(@ModelAttribute("user") user userr, BindingResult result, HttpServletRequest request) {
        HttpSession session=request.getSession(false);
        String userId = null;
	        if(session!=null){  
	        	userId = (String)session.getAttribute("userId"); 
	        }
	        	System.out.println("userId " + userId);
		try {
			if(userId != null ){
				user userUpdate = userser.findUser(Integer.parseInt(userId));
				userUpdate.setName(userr.getName());
				userUpdate.setSurname(userr.getSurname());
				userUpdate.setEmail(userr.getEmail());
				userUpdate.setAddress(userr.getAddress());
				userUpdate.setBdate(userr.getBdate());
				userUpdate.setNationality(userr.getNationality());
				userUpdate.setHight(userr.getHight());
				userUpdate.setWight(userr.getWight());
				userser.update(userUpdate);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:listDataOfStudent.do";
	}
	@RequestMapping("/editDataSutent")
	public ModelAndView newPersonal(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("PersonalForm.jsp");
		user userr = new user();
		mv.addObject("user", userr);
		return mv;
	}

}
