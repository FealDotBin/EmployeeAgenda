package com.example.ws;

public class AgendaSearchService {
	/**
	 * Cerca e restituisce una stringa rappresentativa dell'impiegato con indentificativo id
	 * @param id Identificativo dell'impiegato che si intende cercare
	 * @return stringa rappresentativa dell'impiegato con indentificativo id
	 * @throws EmployeeNotFoundException Lanciata quando l'impiegato con identificativo id non è presente
	 * nell'agenda
	 * @throws EmptyStringException Lanciata quando l'indentificativo passato in input è una stringa vuota
	 * o è null
	 */
	public String searchEmployee(String id) throws EmployeeNotFoundException, EmptyStringException {
		id = InputValidator.sanitizeString(id, "id");

		Employee employee = Agenda.searchEmployee(id);
		return employee.toString();
	}
}
