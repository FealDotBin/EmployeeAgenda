package com.example.ws;

import java.util.LinkedList;
import java.util.Objects;
/**
 * 
 * @author CATELLO
 *	Questa classe rappresenta un impiegato memorizzato dal servirzio
 */
public class Employee {

	private String id;
	private String name;
	private String surname;
	private String email;
	private LinkedList<String> telephoneNumbers;
	private String department;
	
	public Employee(String id, String name, String surname, String email, String telephoneNumber, String department) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.telephoneNumbers = new LinkedList<String>();
		this.telephoneNumbers.add(telephoneNumber);
		this.department = department;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	/**
	 * Imposta il valore del campo name al valore passato in input se questo non è una stringa vuota
	 * @param name Stringa contenente il nome dell'impiegato
	 */
	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		}
	}
	/**
	 * Imposta il valore del campo department al valore passato in input se questo non è una stringa vuota
	 * @param name Stringa contenente il dipartimento dell'impiegato
	 */
	public void setDepartment(String department) {
		if (!department.isEmpty()) {
			this.department = department;
		}
	}

	public String getSurname() {
		return surname;
	}
	/**
	 * Imposta il valore del campo surname al valore passato in input se questo non è una stringa vuota
	 * @param name Stringa contenente il cognome dell'impiegato
	 */
	public void setSurname(String surname) {
		if (!surname.isEmpty()) {
			this.surname = surname;
		}
	}

	public String getEmail() {
		return email;
	}
	/**
	 * Imposta il valore del campo email al valore passato in input se questo non è una stringa vuota
	 * @param name Stringa contenente l'indirizzo e-mail dell'impiegato
	 */
	public void setEmail(String email) {
		if (!email.isEmpty()) {
			this.email = email;
		}
	}

	public LinkedList<String> getTelephoneNumbers() {
		return telephoneNumbers;
	}
	/**
	 * Inserisce il numero di telefono in input alla lista dei numeri di telefono dell'impiegato 
	 * @param telephoneNumber Stringa che rappresenta il numero di telefono da inserire nella lista
	 * @throws TelephoneNumberAlreadyPresentException Lanciata quando il numero di telefono passato in input è già presente
	 */
	public void insertTelephoneNumber(String telephoneNumber) throws TelephoneNumberAlreadyPresentException {
		if (telephoneNumbers.contains(telephoneNumber)) {
			throw new TelephoneNumberAlreadyPresentException("Telephone number already present");
		}
		this.telephoneNumbers.add(telephoneNumber);
	}
	/**
	 * Cancella il numero di telefono in input dalla lista dei numeri di telefono dell'impiegato
	 * @param telephoneNumber Stringa che rappresenta il numero di telefono da eliminare dalla lista
	 * @throws TelephoneNumberNotFoundException Lanciata quando il numero di telefono passato in input non è presente nella lista dell'impiegato
	 * @throws TelephoneNumberCannotBeDeletedException Lanciata quando si cerca di cancellare l'ultimo numero di telefono all'interno della lista
	 */
	public void deleteTelephoneNumber(String telephoneNumber)
			throws TelephoneNumberNotFoundException, TelephoneNumberCannotBeDeletedException {
		int index = telephoneNumbers.indexOf(telephoneNumber);
		if (index == -1) {
			throw new TelephoneNumberNotFoundException("Telephone number not found");
		}
		if (telephoneNumbers.size() == 1) {
			throw new TelephoneNumberCannotBeDeletedException("At least one telephone number must be present");
		}
		telephoneNumbers.remove(index);
	}

	public String getDepartment() {
		return department;
	}
	/**
	 * Restituisce una stringa che rappresenta l'impiegato
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email
				+ ", telephoneNumbers=" + telephoneNumbers + ", department=" + department + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	/**
	 * Due impiegati vengono considerati uguali se hanno lo stesso id
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}

}
