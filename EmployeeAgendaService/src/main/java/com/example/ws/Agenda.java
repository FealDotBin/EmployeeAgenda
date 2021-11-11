package com.example.ws;

import java.util.ArrayList;
/**
 * 
 * @author CATELLO
 * Classe che rappresenta un collezione di impiegati.
 */
public class Agenda {

	private static ArrayList<Employee> agenda = new ArrayList<Employee>();

	public Agenda() {
	}
	/**
	 * Cerca e restiuisce l'impiegato con l'id specificato come input
	 * @param id L'identificativo dell'impiegato da trovare all'interno dell'agenda
	 * @return L'impiegato con identificativo pari a quello passato in input
	 * @throws EmployeeNotFoundException Lanciata quando non esiste nell'agenda un impiegato con identificativo pari a quello in input
	 */
	public static synchronized Employee searchEmployee(String id) throws EmployeeNotFoundException {
		for (Employee employee : agenda) {
			if (employee.getId().equals(id)) {
				return employee;
			}
		}
		throw new EmployeeNotFoundException("Employee Not Found");
	}
	/**
	 * Inserisce l'impiegato passato in input dall'agenda se non è già presente in essa
	 * @param employee L'oggetto che rappresenta l'impiegato da aggiungere all'agenda
	 * @return Una stringa che contiene il risultato dell'operazione di inserimento
	 * @throws EmployeeAlreadyPresentException Lanciata quando l'impiegato in input è gia presente nell'agenda
	 *  (posseggono lo stesso identificativo), in questo caso l'impiegato non viene inserito
	 */
	public static synchronized String insertEmployee(Employee employee) throws EmployeeAlreadyPresentException {
		if (agenda.contains(employee)) {
			throw new EmployeeAlreadyPresentException("Employee Already Present");
		}
		agenda.add(employee);
		return "Employee inserted";
	}
	/**
	 * Elimina l'impiegato passato in input dall'agenda se è presente in essa
	 * @param id Stringa contenente l'identificativo dell'impiegato che si desidera cancellare 
	 * @return Una stringa che contiene il risultato dell'operazione di cancellazione
	 * @throws EmployeeNotFoundException Lanciata quando non esiste nell'agenda un impiegato con lo stesso
	 * idenficativo passato in input. In tal caso l'operazione di cancellazione non può essere eseguita.
	 */
	public static synchronized String deleteEmployee(String id) throws EmployeeNotFoundException {
		Employee employee = searchEmployee(id);
		agenda.remove(employee);
		return "Employee removed";
	}
	/**
	 * Inserisce il numero di telefono telephoneNumber all'interno della lista dei numeri di telefono
	 * dell'impiegato con identificativo pari ad id
	 * @param id Identificativo dell'impiegato al quale si vuole associare un nuovo numero di telefono
	 * @param telephoneNumber Numero di telefono da inserire nella lista dei recapiti dell'impiegato
	 * @return Una stringa che contiene il risultato dell'operazione di inserimento
	 * @throws EmployeeNotFoundException Lanciata quando non esiste nell'agenda un impiegato con lo stesso
	 * idenficativo passato in input. In tal caso l'operazione di inserimento 
	 * del recapito telefonico non può essere eseguita. 
	 * @throws TelephoneNumberAlreadyPresentException Lanciata quando il nuovo numero di telefono è gia presente
	 * nella lista dei recapiti telefonici dell'impiegato con idenficativo pari ad id. Anche in questo caso
	 * l'inserimento non può essere effettuato.
	 */
	public static synchronized String insertTelephoneNumber(String id, String telephoneNumber)
			throws EmployeeNotFoundException, TelephoneNumberAlreadyPresentException {
		Employee employee = searchEmployee(id);
		employee.insertTelephoneNumber(telephoneNumber);
		return "Telephone number added";
	}
	/**
	 * Elimina il numero di telefono telephoneNumber all'interno della lista recapiti telefono
	 * dell'impiegato con identificativo pari ad id
	 * @param id dentificativo dell'impiegato dal quale si vuole rimuovere l'associazione al numero telephoneNumber
	 * @param telephoneNumber Numero di telefono da eliminare dalla lista dei recapiti dell'impiegato
	 * @return Una stringa che contiene il risultato dell'operazione di cancellazione
	 * @throws TelephoneNumberNotFoundException Lanciata quando il recapito telefonico non è presente nella
	 * lista dei numeri di telefono dell'impiegato con identificativo pari ad id. In tal caso l'operazione di cancellazione 
	 * del recapito telefonico non può essere eseguita.  
	 * @throws EmployeeNotFoundException  Lanciata quando non esiste nell'agenda un impiegato con lo stesso
	 * idenficativo passato in input. In tal caso l'operazione di cancellazione 
	 * del recapito telefonico non può essere eseguita. 
	 * @throws TelephoneNumberCannotBeDeletedException Lanciata quando telephoneNumber è l'ultimo recapito telefonico rimanente nella lista
	 * dell'impiegato con identificativo id (Ogni impiegato deve avere almeno un numero telefonico).
	 */
	public static synchronized String deleteTelephoneNumber(String id, String telephoneNumber)
			throws TelephoneNumberNotFoundException, EmployeeNotFoundException,
			TelephoneNumberCannotBeDeletedException {
		Employee employee = searchEmployee(id);
		employee.deleteTelephoneNumber(telephoneNumber);
		return "Telephone number removed";
	}
	/**
	 * Aggiorna il valori dei campi dell'impiegato con identificativo pari ad id 
	 * con quelli passati in input se questi non sono stringhe vuote
	 * @param id Identificativo dell'impiegato che si intende modificare
	 * @param name Nome dell'impiegato aggiornato o stringa vuota
	 * @param surname Cogmome dell'impiegato aggiornato o stringa vuota
	 * @param email Indirizzo email dell'impiegato aggiornato o stringa vuota
	 * @param department Dipartimento dell'impiegato aggiornato o stringa vuota
	 * @return Una stringa che contiene il risultato dell'operazione di modifica e una rappresentazione
	 * testuale dell'impiegato dopo aver subito le operazioni di modifica
	 * @throws EmployeeNotFoundException Lanciata quando l'impiegato con indetificativo id non è presente
	 * nell'agenda. In tal caso l'operazione di aggiornamento non può essere effettuata
	 */
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
