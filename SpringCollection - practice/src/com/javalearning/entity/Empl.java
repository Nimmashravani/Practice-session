package com.javalearning.entity;

public class Empl {
	private int empid;
	private String name;
	private float salary;
	
	public Empl(){
		
	}
	
	public static Empl initialize(){
		Empl empl = new Empl();
		empl.empid = 1 ;
		empl.name = "bvk";
		empl.salary = 110000;
		
		return empl;
	}

	public void init(){
		this.empid = 10;
		this.name = "abc";
		this.salary = 110000;
	}
	
	public void destroy(){
		this.name = null;
		System.out.println("Resources released...");
	}
	@Override
	public String toString() {
		return "empid=" + empid + "\nname=" + name + "\nsalary=" + salary
				+ "\n==============================================================";
	}
}