package com.me.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.me.entity.Student;
import com.me.exception.StudentNotFoundException;
@Service
public interface StudentService {
	public Student registerStudent(Student student);
	public Student updateStudent(Student student);
	public Student deleteStudent(int stdid) throws StudentNotFoundException;
	public Student getStudent(int stdid) throws StudentNotFoundException;
	public List<Student> getStudents();
}