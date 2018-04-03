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
	@EJB(mappedName = "ejb:/Portlity//UserServiecBean!com.porlity.Service.UserService")
	UserService userser;
	
	@RequestMapping("/listDataOfStudent.do")
	public ModelAndView listDataOfStudent (HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("studentProfile.do");
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
				userUpdate.setFirstName(userr.getFirstName());
				userUpdate.setSurName(userr.getSurName());
				userUpdate.setEmail(userr.getEmail());
				userUpdate.setAddress(userr.getAddress());
				userUpdate.setBirthDay(userr.getBirthDay());
				userUpdate.setHight(userr.getHight());
				userUpdate.setWight(userr.getWight());
				userUpdate.setAge(userr.getAge());
				userUpdate.setClassroom(userr.getClassroom());
				userUpdate.setHistoryEducattionPrimary(userr.getHistoryEducattionPrimary());
				userUpdate.setHistoryEducattionHihgthschool13(userr.getHistoryEducattionHihgthschool13());
				userUpdate.setHistoryEducattionHihgthschool46(userr.getHistoryEducattionHihgthschool46());
				userUpdate.setPhone(userr.getPhone());
				userser.update(userUpdate);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:listDataOfStudent.do";
	}
	@RequestMapping("/editDataSutent")
	public ModelAndView newPersonal(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("listDataOfStudent.do");
		user userr = new user();
		mv.addObject("user", userr);
		return mv;
	}

}
