package com.cdp.springAop.spring.aop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * This is a custom aspect annotation to track time for "com.cdp.springAop.spring.aop.dao.BusinessDao.getData3()" 
 * used in "com.cdp.springAop.spring.aop.aspect.CommonPointCutConfig.trackTime()"
 * @author PRIYA GUPTA
 *
 */
@Target(ElementType.METHOD) // Where to apply the aspect here it is methods
@Retention(RetentionPolicy.RUNTIME) // when to apply here it is at runtime
public @interface TrackTime {
	

}
