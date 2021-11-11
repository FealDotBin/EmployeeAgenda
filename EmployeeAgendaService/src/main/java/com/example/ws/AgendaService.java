package com.example.ws;

public class AgendaService {

	public String searchEmployee(String id) throws EmployeeNotFoundException, EmptyStringException {
		id = InputValidator.sanitizeString(id, "id");

		Employee employee = Agenda.searchEmployee(id);
		return employee.toString();
	}

	public String insertEmployee(String id, String name, String surname, String email, String telephoneNumber,
			String department) throws EmployeeAlreadyPresentException, EmptyStringException {
		id = InputValidator.sanitizeString(id, "id");
		name = InputValidator.sanitizeString(name, "name");
		surname = InputValidator.sanitizeString(surname, "surname");
		email = InputValidator.sanitizeString(email, "email");
		telephoneNumber = InputValidator.sanitizeString(telephoneNumber, "telephoneNumber");
		department = InputValidator.sanitizeString(department, "department");

		Employee employee = new Employee(id, name, surname, email, telephoneNumber, department);
		return Agenda.insertEmployee(employee);
	}

	public String deleteEmployee(String id) throws EmployeeNotFoundException, EmptyStringException {
		id = InputValidator.sanitizeString(id, "id");

		return Agenda.deleteEmployee(id);
	}

	public String insertTelephoneNumber(String id, String telephoneNumber)
			throws EmptyStringException, EmployeeNotFoundException, TelephoneNumberAlreadyPresentException {
		id = InputValidator.sanitizeString(id, "id");
		telephoneNumber = InputValidator.sanitizeString(telephoneNumber, "telephoneNumber");

		return Agenda.insertTelephoneNumber(id, telephoneNumber);
	}

	public String deleteTelephoneNumber(String id, String telephoneNumber)
			throws EmptyStringException, TelephoneNumberNotFoundException, EmployeeNotFoundException,
			TelephoneNumberCannotBeDeletedException {
		id = InputValidator.sanitizeString(id, "id");
		telephoneNumber = InputValidator.sanitizeString(telephoneNumber, "telephoneNumber");

		return Agenda.deleteTelephoneNumber(id, telephoneNumber);
	}

	public String updateEmployee(String id, String name, String surname, String email, String department)
			throws EmployeeNotFoundException, EmptyStringException {
		id = InputValidator.sanitizeString(id, "id");
		name = InputValidator.sanitizeStringCanBeNull(name);
		surname = InputValidator.sanitizeStringCanBeNull(surname);
		email = InputValidator.sanitizeStringCanBeNull(email);
		department = InputValidator.sanitizeStringCanBeNull(department);
		
		return Agenda.updateEmployee(id, name, surname, email, department);
	}

}
