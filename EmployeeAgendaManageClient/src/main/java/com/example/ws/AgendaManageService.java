/**
 * AgendaManageService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.ws;

public interface AgendaManageService extends java.rmi.Remote {
    public java.lang.String insertEmployee(java.lang.String id, java.lang.String name, java.lang.String surname, java.lang.String email, java.lang.String telephoneNumber, java.lang.String department) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.EmployeeAlreadyPresentException;
    public java.lang.String updateEmployee(java.lang.String id, java.lang.String name, java.lang.String surname, java.lang.String email, java.lang.String department) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.EmployeeNotFoundException;
    public java.lang.String deleteEmployee(java.lang.String id) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.EmployeeNotFoundException;
    public java.lang.String deleteTelephoneNumber(java.lang.String id, java.lang.String telephoneNumber) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.TelephoneNumberCannotBeDeletedException, com.example.ws.TelephoneNumberNotFoundException, com.example.ws.EmployeeNotFoundException;
    public java.lang.String insertTelephoneNumber(java.lang.String id, java.lang.String telephoneNumber) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.TelephoneNumberAlreadyPresentException, com.example.ws.EmployeeNotFoundException;
}
