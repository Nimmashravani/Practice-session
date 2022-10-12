package com.javalearning.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javalearning.entity.Employee;
import com.javalearning.entity.Student;

public class CheckEmp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e = (Employee) appContext.getBean("empl");
		System.out.println(e);
		
		/*Employee e1 = (Employee) appContext.getBean("empl");
		System.out.println(e1);
		
		if(e == e1){
			System.out.println("Singleton");
		}else{
			System.out.println("Prototype");
		}*/
		
		Student student = (Student) appContext.getBean("stud");
		System.out.println(student);
	}
}