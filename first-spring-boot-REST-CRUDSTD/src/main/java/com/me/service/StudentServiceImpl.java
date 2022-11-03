package com.me.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.dao.StudentRepository;
import com.me.entity.Student;
import com.me.exception.StudentNotFoundException;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository stdRepo;
	
	@Override
	public Student registerStudent(Student student) {
		return stdRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return stdRepo.save(student);
	}

	@Override
	public Student deleteStudent(int stdid)  throws StudentNotFoundException{
		Optional<Student> student = stdRepo.findById(stdid);
		
		Student std = null;
		if(student.isPresent()) {
			stdRepo.deleteById(stdid);
			std = student.get();
		}else {
			throw new StudentNotFoundException("No such student");
		}
		return std;
	}

	@Override
	public Student getStudent(int stdid)  throws StudentNotFoundException{
		Optional<Student> student = stdRepo.findById(stdid);
		Student std = null;
		if(student.isPresent()) {
			std = student.get();
		}else {
			throw new StudentNotFoundException("No such student");
		}
		return std;
	}

	@Override
	public List<Student> getStudents() {
		return stdRepo.findAll();
	}
}