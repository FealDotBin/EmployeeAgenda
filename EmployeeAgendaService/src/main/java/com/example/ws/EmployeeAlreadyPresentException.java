package com.example.ws;

public class EmployeeAlreadyPresentException extends Exception {

	public EmployeeAlreadyPresentException(String message) {
		super(message);
	}
}
