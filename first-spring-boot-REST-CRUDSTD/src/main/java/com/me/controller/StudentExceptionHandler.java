package com.me.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.me.exception.StudentNotFoundException;

@ControllerAdvice
public class StudentExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value 
		      = { StudentNotFoundException.class })
		    protected ResponseEntity<Object> handleConflict(
		      RuntimeException ex, WebRequest request) {
		        String bodyOfResponse = "Student with this stdid not found";
		        return handleExceptionInternal(ex, bodyOfResponse, 
		          new HttpHeaders(), HttpStatus.NOT_FOUND, request);
		    }
}