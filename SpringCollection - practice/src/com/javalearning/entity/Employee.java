package com.javalearning.entity;

import java.util.LinkedHashSet;

public class Employee {
	private int empid;
	private String name;
	private float salary;
	private LinkedHashSet<String>certifications;
	//private ArrayList<String>certifications;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empid, String name, float salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	/*
	 * public ArrayList<String> getCertifications() { return certifications; }
	 * 
	 * public void setCertifications(ArrayList<String> certifications) {
	 * this.certifications = certifications; }
	 */


	public LinkedHashSet<String> getCertifications() {
		return certifications;
	}


	public void setCertifications(LinkedHashSet<String> certifications) {
		this.certifications = certifications;
	}


	@Override
	public String toString() {
		return "empid="
				+ empid
				+ "\nname="
				+ name
				+ "\nsalary="
				+ salary
				+ "\ncertifications="
				+ certifications
				+ "\n==============================================================";
	}


	/*public ArrayList<String> getCertifications() {
		return certifications;
	}


	public void setCertifications(ArrayList<String> certifications) {
		this.certifications = certifications;
	}*/
}