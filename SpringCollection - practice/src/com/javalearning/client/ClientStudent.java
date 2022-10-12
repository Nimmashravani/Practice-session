package com.javalearning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javalearning.entity.Student;

public class ClientStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student = (Student) appContext.getBean("stud");
		
		System.out.println(student);
	}
}