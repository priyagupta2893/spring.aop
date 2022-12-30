package com.cdp.springAop.spring.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdp.springAop.spring.aop.dao.BusinessDao;

@Service
public class Business {
	@Autowired
	BusinessDao dao;

	public String calData() {
		return dao.getData();

	}

}
