package com.whsolutions.pms.web.controller.admin;

import javax.ejb.EJB;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whsolutions.pms.ejb.AdminEjb;

@Controller
public class AdminController {
	
	@EJB
	private AdminEjb adminEJB;
	
	@RequestMapping("/web/test")
	public void testController()
	{
		adminEJB.testEjb();
	}

}
