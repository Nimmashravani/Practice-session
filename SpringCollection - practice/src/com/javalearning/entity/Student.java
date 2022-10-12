package com.javalearning.entity;

import java.util.HashMap;

public class Student {
	private HashMap<Integer, Float>record;

	public Student() {
		super();
	}

	public HashMap<Integer, Float> getRecord() {
		return record;
	}

	public void setRecord(HashMap<Integer, Float> record) {
		this.record = record;
	}

	@Override
	public String toString() {
		return "record=" + record + "\n==============================================================";
	}
	
	
}