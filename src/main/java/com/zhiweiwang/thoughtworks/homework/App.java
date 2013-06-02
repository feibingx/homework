package com.zhiweiwang.thoughtworks.homework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
	    ctx.setConfigLocation("comm.xml");
        ctx.refresh();
		System.out.println("started beans: " + ctx.getBeanDefinitionCount());
	}
}
