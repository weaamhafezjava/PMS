package com.whsolutions.core.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextLocator {

	private static ApplicationContext ctx;
	
	private ApplicationContextLocator(){}
	
	public static ApplicationContext locateContext()
	{
		if(ctx == null)
			ctx = new ClassPathXmlApplicationContext("resourceContext.xml");
		
		return ctx;
	}
}
