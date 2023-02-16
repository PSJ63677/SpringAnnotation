package com.kh.customer.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.kh.customer.domain.Customer;
import com.kh.customer.service.CustomerService;
import com.kh.customer.service.logic.CustomerServiceImpl;



public class CustomerApp {
	public static void main(String [] args) {
		String resource = "spring-context.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(resource);
//		Customer cusOne = (Customer)ctx.getBean("customer");
//		System.out.println(cusOne.toString());
		// bean등록(@Component) 해주지 않은 부분 지워야 오류 나지 않음
		
		CustomerService cService = (CustomerServiceImpl)ctx.getBean("customerService");
		List<Customer> list = cService.findAllCustomers();
		for(Customer cOne: list) {
			System.out.println(cOne.toString());
		}
	}
}
