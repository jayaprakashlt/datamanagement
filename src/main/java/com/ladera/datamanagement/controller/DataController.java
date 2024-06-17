package com.ladera.datamanagement.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.ladera.datamanagement.configurations.CustomerData;

@RestController
@RefreshScope
public class DataController {

	@Value("${custom.data.value}")
	public String data;

	@Autowired
	private CustomerData customer;
	
	@GetMapping("/get")
	public String getData() {
		return data;
	}
	

	@GetMapping("/get-customer")
	public CustomerData getCustomer() {
		CustomerData customerData = new CustomerData();
		
		BeanUtils.copyProperties(customer, customerData);
		return customerData;
	}
}
