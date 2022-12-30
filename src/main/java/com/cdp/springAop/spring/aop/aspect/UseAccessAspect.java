package com.cdp.springAop.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP related configuration
@Aspect // combo of point cut and advice
@Configuration
public class UseAccessAspect {
	private Logger log = LoggerFactory.getLogger(UseAccessAspect.class);

	/**
	 * syntax for @Before for every class and every method in it irrespective of
	 * arguments in methods execution(* PACKAGE.*.*(..))
	 * framework that provides point cuts etc is weaver and process ia weaving
	 * @param jp
	 */
	@Before("execution(* com.cdp.springAop.spring.aop.service.*.*(..))")
	public void before(JoinPoint jp) { // this is point cut
		// this is advice what to do after point cut
		log.info("Check if user has access"); // logic below
		log.info("Allow access {}", jp); // allow access
	}

	/**
	 * syntax for @Before for specific class and method in it irresoective of arg in
	 * it
	 */
	@Before("execution(* com.cdp.springAop.spring.aop.service.Business.calData(..))")
	public void before1(JoinPoint jp) {
		log.info("Method intercepted call {}", jp);
	}

	/**
	 * syntax for @Before for sub package for every class and every method in it
	 * irrespective of arguments in methods execution(* PACKAGE.*.*(..))
	 * 
	 */
	@Before("execution(* com.cdp.springAop.spring.aop..*.*(..))")
	public void before3(JoinPoint jp) {
		log.info("Check if user has access");
		log.info("Allow access {}", jp);
	}
}
