package com.cdp.springAop.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * This class explains common configuration of point cuts rather declaring in
 * separate classes
 * 
 * @author PRIYA GUPTA
 */
//AOP related configuration
@Aspect // combo of point cut and advice
@Configuration
public class CommonPointCutConfig {

	/**
	 * declare service layer point cut here and use this method over the method
	 * where you want to use this point cut Eg: go to
	 * "com.cdp.springAop.spring.aop.aspect.BeforeAspect.before(JoinPoint)" and
	 * check
	 */
	@Pointcut("execution(* com.cdp.springAop.spring.aop.service.*.*(..))")
	public void serviceLayerPointCutConfig() {
	}

	/**
	 * declare dao layer point cut here and use this method over the method where
	 * you want to use this point cut Eg: go to
	 * "com.cdp.springAop.spring.aop.aspect.AfterAopAspect.after(JoinPoint)" and
	 * check
	 */
	@Pointcut("execution(* com.cdp.springAop.spring.aop.dao.*.*(..))")
	public void daoLayerPointCutConfig() {
	}

	//Some more point cuts
	/**
	 * This pointcut is more close as this contains combination od dao and service
	 * defined above
	 */
	@Pointcut("com.cdp.springAop.spring.aop.aspect.CommonPointCutConfig.serviceLayerPointCutConfig() && com.cdp.springAop.spring.aop.aspect.CommonPointCutConfig.daoLayerPointCutConfig()")
	public void businessAndDaoLayerPointCut() {
	}

	/**
	 * This point cut defines beans starting with dao
	 */
	@Pointcut("bean(Dao*)")
	public void beanStartingWithDao() {
	}

	/**
	 * This point cut defines beans containing "dao" within their names
	 */
	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {
	}
	
	/**
	 * This point cut used for everything within dao layer
	 */
	@Pointcut("within(com.cdp.springAop.spring.aop.dao..*)")
	public void dataLayerWithWithinDao() {
	}
	
	/**
	 * This method is for custom annotation and can be used at several places where we used dao layer aspects or service layer 
	 * eg: used in "com.cdp.springAop.spring.aop.aspect.MethodExecutionCalculationAspect.around2(ProceedingJoinPoint)"
	 */
	@Pointcut("@annotation(com.cdp.springAop.spring.aop.aspect.TrackTime)")
	public void trackTime() {}

}
