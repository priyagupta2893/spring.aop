package com.cdp.springAop.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cdp.springAop.spring.aop.service.Business;
import com.cdp.springAop.spring.aop.service.Business2;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private Logger log = LoggerFactory.getLogger(Application.class);
	@Autowired
	Business bus;
	
	@Autowired
	Business2 bus2; 

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(bus.calData());
		log.info(bus2.calData());
		
	}

}
