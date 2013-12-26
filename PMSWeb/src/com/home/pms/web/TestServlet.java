package com.home.pms.web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import com.home.pms.utils.PMSLogger;

import com.whsolutions.pms.ejb.AdminEjbLocal;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;


@Component("TestServlet")
public class TestServlet implements HttpRequestHandler  {
	private static final long serialVersionUID = 1L;
	private Logger log = LoggerFactory.getLogger(TestServlet.class);
	@Autowired
	private PMSLogger pmsLogger;
	
	@Autowired
	private AdminEjbLocal adminEJB;
	
    public TestServlet() {
    }
	@Override
	public void handleRequest(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		
//		try {
//			InitialContext ctx = new InitialContext();
//			adminEjb.testEjb();
//		} catch (NamingException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		StatusPrinter.print((LoggerContext)LoggerFactory.getILoggerFactory());
		
		try {
//			ApplicationContext ctx = new ClassPathXmlApplicationContext(DEBUG_LOG_CONF_FILEPATH);
//			PMSLogger pmsLogger =  (PMSLogger)ctx.getBean(PMS_LOGGER_BEAN);
			adminEJB.testEjb();
			pmsLogger.locatePMSLogger();
			System.out.print("");
		}
		catch (Exception e) 
		{
			log.error(e.getMessage());
		}
		
		
	}

}
