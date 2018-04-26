package com.porlity.Controller;

import java.util.Map;

import net.codejava.spring.model.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
		Admin adminForm = new Admin();
		model.put("adminForm", adminForm);
		return "Registration";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("adminForm") Admin admin, Map<String, Object> model) {

		// implement your own registration logic here...

		// for testing purpose:
		System.out.println("username: " + admin.getUsername());
		System.out.println("password: " + admin.getPassword());

		return "RegistrationSuccess";
	}
}