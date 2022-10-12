package com.javalearning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javalearning.entity.Empl;

public class ClientInitialize {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empl empl = (Empl)appContext.getBean("emp");
		
		System.out.println(empl);
		
		((AbstractApplicationContext)appContext).registerShutdownHook();
	}
}