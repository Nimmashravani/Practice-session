package com.me.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.me.entity.Employee;
import com.me.exception.EmployeeNotFoundException;
import com.me.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost", maxAge = 3600)
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value = "/register", consumes={MediaType.APPLICATION_JSON_VALUE})
	public Employee registerEmployee(@RequestBody Employee employee) {
		return employeeService.registerEmployee(employee);
	}
	
	@PutMapping(value = "/update",consumes={MediaType.APPLICATION_JSON_VALUE})
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public Employee deleteEmployee(@PathVariable("id") int empid) throws EmployeeNotFoundException {
		return employeeService.deleteEmployee(empid);
	}
	
	@GetMapping(value = "/get/{id}")
	public Employee getEmployee(@PathVariable("id") int empid) throws EmployeeNotFoundException{
		return employeeService.getEmployee(empid);
	}
	
	@GetMapping(value = "/getAll")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
}