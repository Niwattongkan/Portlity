package com.porlity.Controller;

import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.porlity.Service.InformationService;
import com.porlity.entity.information;

@Controller
public class InformationController {
	@EJB(mappedName = "ejb:/Portlity//InformationServiceBean!com.porlity.Service.InformationService")
	 InformationService informationSer;
	 
	 @RequestMapping("/studentHomepage")
	 public ModelAndView listInformation(HttpServletRequest request){
		 ModelAndView mv = new ModelAndView("studentHomepage.jsp");
		 List<information> listinformation;
		 try{
			 listinformation = informationSer.getAll();
			 mv.addObject("listInformation",listinformation);
		 }catch (Exception e) {
			// TODO: handle exception
		}
		 return mv;
	 }
}
