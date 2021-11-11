package com.example.ws;

import java.util.ArrayList;

public class Agenda {

	private static ArrayList<Employee> agenda = new ArrayList<Employee>();

	public Agenda() {
	}

	public static synchronized Employee searchEmployee(String id) throws EmployeeNotFoundException {
		for (Employee employee : agenda) {
			if (employee.getId().equals(id)) {
				return employee;
			}
		}
		throw new EmployeeNotFoundException("Employee Not Found");
	}

	public static synchronized String insertEmployee(Employee employee) throws EmployeeAlreadyPresentException {
		if (agenda.contains(employee)) {
			throw new EmployeeAlreadyPresentException("Employee Already Present");
		}
		agenda.add(employee);
		return "Employee inserted";
	}

	public static synchronized String deleteEmployee(String id) throws EmployeeNotFoundException {
		Employee employee = searchEmployee(id);
		agenda.remove(employee);
		return "Employee removed";
	}

	public static synchronized String insertTelephoneNumber(String id, String telephoneNumber)
			throws EmployeeNotFoundException, TelephoneNumberAlreadyPresentException {
		Employee employee = searchEmployee(id);
		employee.insertTelephoneNumber(telephoneNumber);
		return "Telephone number added";
	}

	public static synchronized String deleteTelephoneNumber(String id, String telephoneNumber)
			throws TelephoneNumberNotFoundException, EmployeeNotFoundException,
			TelephoneNumberCannotBeDeletedException {
		Employee employee = searchEmployee(id);
		employee.deleteTelephoneNumber(telephoneNumber);
		return "Telephone number removed";
	}

	public static synchronized String updateEmployee(String id, String name, String surname, String email,
			String department) throws EmployeeNotFoundException {
		Employee employee = searchEmployee(id);
		
		employee.setName(name);
		employee.setSurname(surname);
		employee.setEmail(email);
		employee.setDepartment(department);
		
		return "Employee updated: " + employee.toString();
	}
}
