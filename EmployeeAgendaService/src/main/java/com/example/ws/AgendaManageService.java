package com.example.ws;

public class AgendaManageService {
	/**
	 * Crea e inserisce un nuovo impiegato nell'agenda
	 * @param id Identificativo dell'impiegato che si intende inserire
	 * @param name Nome dell'impiegato
	 * @param surname Cognome dell'impiegato
	 * @param email Indirizzo e-mail dell'impiegato
	 * @param telephoneNumber recapito telefonico dell'impiegato
	 * @param department Dipartimento di appartenenza dell'impiegato
	 * @return Stringa contenente il risultato dell'operazione di inserimento nell'agenda
	 * @throws EmployeeAlreadyPresentException Lanciata quando il nuovo impiegato creato ha identificativo
	 * coincidente con un altro impiegato presente nella lista. In tal caso l'operazione di inserimento
	 * non può avvenire
	 * @throws EmptyStringException Lanciata se uno dei parametri è null o è una stringa vuota
	 * (è obbligatorio specificare tutti i parametri)
	 */
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

	/**
	 * Elimina l'impiegato passato in input dall'agenda se è presente in essa
	 * @param id Stringa contenente l'identificativo dell'impiegato che si desidera cancellare 
	 * @return Una stringa che contiene il risultato dell'operazione di cancellazione
	 * @throws EmployeeNotFoundException Lanciata quando non esiste nell'agenda un impiegato con lo stesso
	 * idenficativo passato in input. In tal caso l'operazione di cancellazione non può essere eseguita.
	 * @throws EmptyStringException Lanciata quando l'indentificativo passato in input è null o una
	 * stringa vuota (è obbligatorio specificare l'id dell'impiegato da cancellare). In tal caso l'operazione
	 * di cancellazione non può essere effettuata.
	 */
	public String deleteEmployee(String id) throws EmployeeNotFoundException, EmptyStringException {
		id = InputValidator.sanitizeString(id, "id");

		return Agenda.deleteEmployee(id);
	}

	/**
	 * Inserisce il numero di telefono telephoneNumber all'interno della lista dei numeri di telefono
	 * dell'impiegato con identificativo pari ad id
	 * @param id Identificativo dell'impiegato al quale si vuole associare un nuovo numero di telefono
	 * @param telephoneNumber  Numero di telefono da inserire nella lista dei recapiti dell'impiegato
	 * @return Una stringa che contiene il risultato dell'operazione di inserimento
	 * @throws EmptyStringException Lanciata quando l'indentificativo o il numero di telefono
	 * passato in input sono null o stringhe vuote (è obbligatorio specificare l'id e il numero di telefono da inserire).
	 * In tal caso l'operazione di input non viene eseguita.
	 * @throws EmployeeNotFoundException Lanciata quando non esiste nell'agenda un impiegato con lo stesso
	 * idenficativo passato in input. In tal caso l'operazione di inserimento 
	 * del recapito telefonico non può essere eseguita. 
	 * @throws TelephoneNumberAlreadyPresentException Lanciata quando il nuovo numero di telefono è gia presente
	 * nella lista dei recapiti telefonici dell'impiegato con idenficativo pari ad id. Anche in questo caso
	 * l'inserimento non può essere effettuato.
	 */
	public String insertTelephoneNumber(String id, String telephoneNumber)
			throws EmptyStringException, EmployeeNotFoundException, TelephoneNumberAlreadyPresentException {
		id = InputValidator.sanitizeString(id, "id");
		telephoneNumber = InputValidator.sanitizeString(telephoneNumber, "telephoneNumber");

		return Agenda.insertTelephoneNumber(id, telephoneNumber);
	}
	/**
	 * Elimina il numero di telefono telephoneNumber all'interno della lista dei recapiti
	 * dell'impiegato con identificativo pari ad id
	 * @param id identificativo dell'impiegato dal quale si vuole rimuovere l'associazione al numero telephoneNumber
	 * @param telephoneNumber Numero di telefono da eliminare dalla lista dei recapiti dell'impiegato
	 * @return Una stringa che contiene il risultato dell'operazione di cancellazione
	 * @throws EmptyStringException  Lanciata quando l'indentificativo o il numero di telefono
	 * passato in input sono null o stringhe vuote (è obbligatorio specificare l'id e il numero di telefono da inserire)
	 * In tal caso l'operazione di cancellazione non viene effettuata.
	 * @throws EmployeeNotFoundException Lanciata quando non esiste nell'agenda un impiegato con lo stesso
	 * idenficativo passato in input. In tal caso l'operazione di inserimento 
	 * del recapito telefonico non può essere eseguita. 
	 * @throws TelephoneNumberNotFoundException Lanciata quando il recapito telefonico non è presente nella
	 * lista dei numeri di telefono dell'impiegato con identificativo pari ad id. In tal caso l'operazione di cancellazione 
	 * del recapito telefonico non può essere eseguita.  
	 * @throws EmployeeNotFoundException Lanciata quando non esiste nell'agenda un impiegato con lo stesso
	 * idenficativo passato in input. In tal caso l'operazione di cancellazione 
	 * del recapito telefonico non può essere eseguita. 
	 * @throws TelephoneNumberCannotBeDeletedException  Lanciata quando telephoneNumber è l'ultimo recapito telefonico rimanente nella lista
	 * dell'impiegato con identificativo id (Ogni impiegato deve avere almeno un numero telefonico).
	 */
	public String deleteTelephoneNumber(String id, String telephoneNumber)
			throws EmptyStringException, TelephoneNumberNotFoundException, EmployeeNotFoundException,
			TelephoneNumberCannotBeDeletedException {
		id = InputValidator.sanitizeString(id, "id");
		telephoneNumber = InputValidator.sanitizeString(telephoneNumber, "telephoneNumber");

		return Agenda.deleteTelephoneNumber(id, telephoneNumber);
	}
	/**
	 * Aggiorna il valori dei campi dell'impiegato con identificativo pari ad id 
	 * con quelli passati in input se questi non sono stringhe vuote
	 * @param id Identificativo dell'impiegato che si intende modificare
	 * @param name Nome dell'impiegato aggiornato
	 * @param surname Cogmome dell'impiegato aggiornato
	 * @param email Indirizzo email dell'impiegato aggiornato
	 * @param department Dipartimento dell'impiegato aggiornato
	 * @return Una stringa che contiene il risultato dell'operazione di modifica e una rappresentazione
	 * testuale dell'impiegato dopo aver subito le operazioni di modifica
	 * @throws EmployeeNotFoundException  Lanciata quando l'impiegato con indetificativo id non è presente
	 * nell'agenda. In tal caso l'operazione di aggiornamento non può essere effettuata
	 * @throws EmptyStringException Lanciata quando l'indentificativo passato in input è null o una
	 * stringa vuota (è obbligatorio specificare l'id dell'impiegato da modificare). In tal caso l'aggiornamento
	 * non può essere effettuata.
	 */
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
