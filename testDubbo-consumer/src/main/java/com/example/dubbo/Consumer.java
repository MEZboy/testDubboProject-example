package com.example.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * multicast方式dubbo consumer
 * zookeeper方式dubbo consumer
 * 
 * @author mezbo
 */
public class Consumer {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		GreetingService greetingService = (GreetingService) context.getBean("greetingService");
		String greetMessage = greetingService.sayHello("Matrixlolllllll");
		System.out.println("Consumer ==> " + greetMessage);
		//context.destroy();
	}
}