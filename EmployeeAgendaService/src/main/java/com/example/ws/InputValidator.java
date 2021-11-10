package com.example.ws;

public class InputValidator {

	public static String sanitizeString(String string) throws EmptyStringException {
		string = string.trim();
		if (string.isEmpty()) {
			throw new EmptyStringException("String cannot be empty");
		}
		return string;
	}
}
