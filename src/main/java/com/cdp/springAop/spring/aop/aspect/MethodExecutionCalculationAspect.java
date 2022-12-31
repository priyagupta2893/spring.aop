package com.cdp.springAop.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * This class explains Around aspect
 * 
 * @author PRIYA GUPTA
 */
//AOP related configuration
@Aspect // combo of point cut and advice
@Configuration
public class MethodExecutionCalculationAspect {
	private Logger log = LoggerFactory.getLogger(MethodExecutionCalculationAspect.class);

	/**
	 * This advice calculates the time taken by methods that are executed in join
	 * point
	 * 
	 * @param jp
	 * @throws Throwable
	 */
	@Around("execution(* com.cdp.springAop.spring.aop.service.*.*(..))")
	public void around(ProceedingJoinPoint jp) throws Throwable { // this is point cut
		long startTime = System.currentTimeMillis();
		jp.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		log.info("time taken by {} is {}", jp, timeTaken); // logic below
	}

	@Around("com.cdp.springAop.spring.aop.aspect.CommonPointCutConfig.trackTime()")
	public void around2(ProceedingJoinPoint jp) throws Throwable { // this is point cut
		long startTime = System.currentTimeMillis();
		jp.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		log.info("time taken by track time annotation {} is {}", jp, timeTaken); // logic below
	}
}
