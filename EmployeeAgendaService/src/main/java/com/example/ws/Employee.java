package com.example.ws;

import java.util.LinkedList;
import java.util.Objects;

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

	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		}
	}

	public void setDepartment(String department) {
		if (!surname.isEmpty()) {
			this.department = department;
		}
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		if (!surname.isEmpty()) {
			this.surname = surname;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (!email.isEmpty()) {
			this.email = email;
		}
	}

	public LinkedList<String> getTelephoneNumbers() {
		return telephoneNumbers;
	}

	public void insertTelephoneNumber(String telephoneNumber) throws TelephoneNumberAlreadyPresentException {
		if (telephoneNumbers.contains(telephoneNumber)) {
			throw new TelephoneNumberAlreadyPresentException("Telephone number already present");
		}
		this.telephoneNumbers.add(telephoneNumber);
	}

	public void deleteTelephoneNumber(String telephoneNumber)
			throws TelephoneNumberNotFoundException, TelephoneNumberCannotBeDeletedException {
		if (telephoneNumbers.size() == 1) {
			throw new TelephoneNumberCannotBeDeletedException("At least one telephone number must be present");
		}
		int index = telephoneNumbers.indexOf(telephoneNumber);
		if (index == -1) {
			throw new TelephoneNumberNotFoundException("Telephone number not found");
		}
		telephoneNumbers.remove(index);
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email
				+ ", telephoneNumbers=" + telephoneNumbers + ", department=" + department + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

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
