package com.whsolutions.pms.web.controller.admin;

import javax.ejb.EJB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whsolutions.pms.ejb.AdminEjb;
import com.whsolutions.pms.ejb.AdminEjbLocal;

@Controller
public class AdminController {
	
	@Autowired
	private AdminEjbLocal adminEJB;
	
	@RequestMapping("/web/test")
	public void testController()
	{
		adminEJB.testEjb();
	}

}
