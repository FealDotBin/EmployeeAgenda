/**
 * AgendaSearchService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.ws;

public interface AgendaSearchService extends java.rmi.Remote {
    public java.lang.String searchEmployee(java.lang.String id) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.EmployeeNotFoundException;
}
