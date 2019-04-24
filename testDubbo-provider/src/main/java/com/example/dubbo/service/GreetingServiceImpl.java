package com.example.dubbo.service;

import java.util.Date;

import com.example.dubbo.GreetingService;

public class GreetingServiceImpl implements GreetingService {
	public String sayHello(String name) {
		System.out.println("Hello Service is calling : " + new Date());
		String greetMessage = "Hello, " + name;
		return greetMessage;
	}
}
