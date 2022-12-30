package com.cdp.springAop.spring.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdp.springAop.spring.aop.dao.BusinessDao2;

@Service
public class Business2 {
	@Autowired
	BusinessDao2 dao2;

	public String calData() {
		return dao2.getData2();

	}

}
