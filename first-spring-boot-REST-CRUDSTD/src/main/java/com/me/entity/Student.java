package com.me.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int stdid;
	
	@NotNull
	private String name;
	
	@Min(25000)
	private float fee;

	public Student() {
		super();
	}

	public Student(int stdid, String name, float fee) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.fee = fee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public int getStdid() {
		return stdid;
	}

	@Override
	public int hashCode() {
		return stdid;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (stdid != other.stdid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(fee) != Float.floatToIntBits(other.fee))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", name=" + name + ", fee=" + fee + "]";
	}
	
	
}