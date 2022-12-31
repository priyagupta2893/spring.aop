package com.cdp.springAop.spring.aop.dao;

import org.springframework.stereotype.Repository;

import com.cdp.springAop.spring.aop.aspect.TrackTime;

@Repository
public class BusinessDao2 {
	@TrackTime
	public String getData2() {
		return "Data2";
	}

}
