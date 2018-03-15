package com.porlity.Controller;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.porlity.Service.pageDetailService;
import com.porlity.entity.pageDetail;

@Controller
public class PagedetailController {
	@EJB(mappedName = "ejb:/Portlity//pageDetailServiceBean!com.porlity.Service.pageDetailService")
	pageDetailService pageDetailServ;
	
	@RequestMapping("/savepageDetail")
	public String savepageDetail(@ModelAttribute("pageDetail") pageDetail pageDetail,BindingResult result, HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		String userId = null;
        if(session!=null){  
        	userId = (String)session.getAttribute("userId"); 
        }
        	System.out.println("userId " + userId);
		try {
			if(userId != null ){
				pageDetailServ.insert(pageDetail);
				pageDetail pageDetailUpdate = pageDetailServ.findpageDetail(Integer.parseInt(userId));				
				pageDetailUpdate.setBody(pageDetail.getBody());
			}else{
				pageDetailServ.insert(pageDetail);
			}
			}catch (Exception e) {
				// TODO: handle exception
	}
		return "redirect:studentHomepage.jsp";
	}
	@RequestMapping("/newPagedetail")
	public ModelAndView newPagedetail(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("activity.jsp");
		pageDetail pageDetail = new pageDetail();
		mv.addObject("pageDetail",pageDetail);
		return mv;
	}
}
	

