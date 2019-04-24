package com.example.dubbo;

/**
 * 有了接口，就可以在Provider中完成接口的实现，并暴露接口服务为Dubbo服务给其它模块使用（如consumer）
 * @author mezbo
 */
public interface GreetingService {
	String sayHello(String name);
}
