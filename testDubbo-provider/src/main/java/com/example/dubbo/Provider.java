package com.example.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * multicast方式的dubbo provider
 * @author mezbo
 *
 */
public class Provider {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		context.start();
		System.in.read(); 
	}
}