package com.me.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.me.entity.Student;
import com.me.exception.StudentNotFoundException;
import com.me.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost", maxAge = 3600)
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping(value = "/register")
	public Student registerEmployee(@RequestBody @Valid Student student) {
		return studentService.registerStudent(student);
	}
	
	@PutMapping(value = "/update")
	public Student updateStudent(@RequestBody @Valid Student student) {
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public Student deleteStudent(@PathVariable("id") int stdid) throws StudentNotFoundException {
		return studentService.deleteStudent(stdid);
	}
	
	@GetMapping(value = "/get/{id}")
	public Student getStudent(@PathVariable("id") int stdid) throws StudentNotFoundException{
		return studentService.getStudent(stdid);
	}
	
	@GetMapping(value = "/getAll")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
}