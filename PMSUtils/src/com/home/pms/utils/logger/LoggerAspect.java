package com.home.pms.utils.logger;

import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
	
@Aspect
public class LoggerAspect {
	/**
	 * this method used only to log the time elapsed for each function to monitor system performance in debug mode
	 * to apply this method on a function the enclosing class if the method must be added to the conf file debugBeansContext.xml
	 * @param joinPoint
	 * @throws Throwable
	 */
	@Around("execution(* *(..))")
	public void logMethodTime(ProceedingJoinPoint joinPoint) throws Throwable
	{
		Logger log = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		try 
		{
			String targetClassName = joinPoint.getTarget().getClass().getName();
			String targetMethodName = joinPoint.getSignature().getName();
			// print the start time of method
			Calendar startDate = Calendar.getInstance();
			log.debug("Method: " + targetClassName + "." + targetMethodName + " Started: " + startDate.get(Calendar.HOUR) + ":" + startDate.get(Calendar.MINUTE) + ":" + startDate.get(Calendar.SECOND) +"." + startDate.get(Calendar.MILLISECOND));
			
			// proceed the method
			joinPoint.proceed();
			
			// print the end time of method
			Calendar endDate = Calendar.getInstance();
			log.debug("Method: " + targetClassName + "." + targetMethodName + " Ended: " + endDate.get(Calendar.HOUR) + ":" + endDate.get(Calendar.MINUTE) + ":" + endDate.get(Calendar.SECOND) +"." + endDate.get(Calendar.MILLISECOND));
			
			//print the time elapsed
			log.debug("Method: " + targetClassName + "." + targetMethodName + " Time elapsed: " + ((endDate.getTimeInMillis() - startDate.getTimeInMillis()) / 1000d)+ " seconds");
		} 
		catch (Throwable e)
		{
			log.error(e.getMessage());
		}
	}
}
