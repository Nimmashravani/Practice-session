package com.me.exception;

public class StudentNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1631823366296521859L;

	public StudentNotFoundException() {
	}

	public StudentNotFoundException(String message) {
		super(message);
	}
}