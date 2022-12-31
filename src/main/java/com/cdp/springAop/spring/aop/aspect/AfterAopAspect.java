package com.cdp.springAop.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * This class explains After aspect
 * 
 * @author PRIYA GUPTA
 */
//AOP related configuration
@Aspect // combo of point cut and advice
@Configuration
public class AfterAopAspect {
	private Logger log = LoggerFactory.getLogger(AfterAopAspect.class);

	/**
	 * syntax for @After for every class and every method in it irrespective of
	 * arguments in methods execution(* PACKAGE.*.*(..)) framework that provides
	 * point cuts etc is weaver and process ia weaving
	 * 
	 * @param jp
	 */
	@After("com.cdp.springAop.spring.aop.aspect.CommonPointCutConfig.daoLayerPointCutConfig()")
	public void after(JoinPoint jp) { // this is point cut
		// this is advice what to do after point cut
		log.info("after execution of {}", jp); // logic below
	}

	/**
	 * syntax for @AfterReturning for specific class and method in it irresoective
	 * of arg in it
	 */
	@AfterReturning(value = "execution(* com.cdp.springAop.spring.aop.service.Business.calData(..))", returning = "result")
	public void afterReturning(JoinPoint jp, Object result) {
		log.info("{} after returning show {}", jp, result);
	}

	/**
	 * syntax for @Before for sub package for every class and every method in it
	 * irrespective of arguments in methods execution(* PACKAGE.*.*(..))
	 * 
	 */
	@AfterThrowing(value = "execution(* com.cdp.springAop.spring.aop..*.*(..))", throwing = "exception")
	public void afterThroowing(JoinPoint jp, Object exception) {
		log.info("After execution {} throw {}", jp, exception);
	}
}
