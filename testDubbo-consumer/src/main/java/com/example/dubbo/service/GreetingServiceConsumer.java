package com.example.dubbo.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

import com.example.dubbo.GreetingService;

@Component("annotatedConsumer")
public class GreetingServiceConsumer {
	@Reference
    private GreetingService greetingService;

    public String doSayHello(String name) {
        return greetingService.sayHello(name);
    }
}