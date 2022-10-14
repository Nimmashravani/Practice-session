package com.me.streamapi;

public class StudentPercentage {

	private int studentID;
	private String name;
	private float percent;
	private String branch;
	public StudentPercentage(int studentID,String name,float percent,String branch) {
		this.studentID = studentID;
		this.name = name;
		this.percent = percent;
		this.branch = branch;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "StudentPercentage [studentID=" + studentID + ", name=" + name + ", percent=" + percent + ", branch="
				+ branch + "]";
	}

	
	
}



