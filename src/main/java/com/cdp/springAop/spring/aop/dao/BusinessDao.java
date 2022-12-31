package com.cdp.springAop.spring.aop.dao;

import org.springframework.stereotype.Repository;

import com.cdp.springAop.spring.aop.aspect.TrackTime;

@Repository
public class BusinessDao {
	
	public String getData() {
		return "Data";
	}
	@TrackTime
	public String getData3() {
		return "Data3";
	}

}
