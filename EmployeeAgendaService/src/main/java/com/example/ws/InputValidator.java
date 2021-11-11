package com.example.ws;

public class InputValidator {

	public static String sanitizeString(String string, String variableName) throws EmptyStringException {
		if (string == null) {
			throw new EmptyStringException("Field " + variableName + " is mandatory");
		}
		string = string.trim();
		if (string.isEmpty()) {
			throw new EmptyStringException("Field " + variableName + " cannot be empty");
		}
		return string;
	}

	public static String sanitizeStringCanBeNull(String string) {
		if (string == null) {
			string = "";
		} else {
			string = string.trim();
		}
		return string;
	}
}
