package com.home.pms.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class PMSLogger {
	
	public PMSLogger()
	{
	}
	private static final Logger log = LoggerFactory.getLogger(PMSLogger.class);
	private static PMSLogger pmsLogger;
	public  void locatePMSLogger()
	{
		log.error("test error");
		log.info("test info");
		log.debug("test debug");
		
//		if(pmsLogger == null)
//		{
//			return new PMSLogger();
//		}
//			
//		
//		return pmsLogger;
	}
	
	
	
	public void formatLogFile(String message)
	{
		
	}

}
