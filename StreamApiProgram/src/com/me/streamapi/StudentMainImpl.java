package com.me.streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMainImpl
{

	public static void main(String[] args) 
	{
		List<StudentPercentage> students = new ArrayList<>();
		
		StudentPercentage s1= new StudentPercentage(12,"ABC",68.1f,"ECE");
		StudentPercentage s2= new StudentPercentage(14,"DEF",96.9f,"electrical engg");
		StudentPercentage s3= new StudentPercentage(19,"GHI",88.2f,"CSE");
	   
		
		students.add(s1);
		students.add(s2);
		students.add(s3);

		getHighestPercent(students);
		studentsReportingToBranch(students);
		percentLessThan90(students);
		percentGreaterThan80(students);
		studentNameStartWithA(students);
	}
		
		public static void getHighestPercent(List<StudentPercentage> students)
		{
		System.out.println(students.stream().max((stud1,stud2)->(int)(stud1.getPercent()-stud2.getPercent())));
		}
		
		public static void studentsReportingToBranch(List<StudentPercentage> students)
		{
		System.out.println(students.stream().filter(stud->stud.getBranch()=="electrical engg").count());
		}
		
		public static void percentLessThan90(List<StudentPercentage> students)
		{
		System.out.println(students.stream().filter(stud->stud.getPercent()<90).collect(Collectors.toList()));
		}
		
		public static void percentGreaterThan80(List<StudentPercentage> students)
		{
		System.out.println(students.stream().filter(stud->stud.getPercent()>80).collect(Collectors.toList()));
		}
		
		public static void studentNameStartWithA(List<StudentPercentage> students )
		{
		System.out.println(students.stream().filter(stud->stud.getName().matches("^[A].*")).collect(Collectors.toList()));
		}

		

}

	
	


