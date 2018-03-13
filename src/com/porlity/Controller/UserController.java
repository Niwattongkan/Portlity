package com.porlity.Controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.porlity.Service.TypeUserService;
import com.porlity.Service.UserService;
import com.porlity.entity.user;
@Controller
public class UserController {
	@EJB(mappedName = "ejb:/PorlityClient//UserServiecBean!com.porlity.Service.UserService")
	UserService userServ;
	
	@RequestMapping("/supperAdminUser")
	public ModelAndView listEmployee(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("profilestudent.jsp");
		List<user> userList;
		try {
			userList = userServ.getAllUser();
			mv.addObject("userList",userList);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mv;		
	}
	
	@RequestMapping("/profileport")
	public ModelAndView listPDF(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("port1.jsp");
		List<user> PDFList;
		try {
			PDFList = userServ.getAllUser();
			mv.addObject("PDFList",PDFList);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mv;		
	}
	
	@RequestMapping("/newUser")
	public ModelAndView newEmployee() {
		ModelAndView mv = new ModelAndView("fillinFromStudent.jsp");
		user us = new user();
		mv.addObject("us",us);
		return mv;
	}
	
	@RequestMapping("/saveUser")
	public String saveEmp(@ModelAttribute("us") user user,BindingResult result,
			HttpServletRequest request) {
		try {
			if(user.getUserID() == 0){
				userServ.insert(user);
			}else{
				userServ.update(user);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:profileport.do";
	}
	
	@RequestMapping("/editUser")
	public ModelAndView editEmp(HttpServletRequest request) {
		int paramId = Integer.parseInt(request.getParameter("id"));
		user us;
		ModelAndView mv = new ModelAndView("port2.jsp");
		try {
			us = userServ.findUser(paramId);
			mv.addObject("us",us);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/deleteUser")
	public String deleteEmp(HttpServletRequest request) {
		userServ.delete(Long.valueOf(request.getParameter("id")));
		return "redirect:profileport.do";
	}
}
