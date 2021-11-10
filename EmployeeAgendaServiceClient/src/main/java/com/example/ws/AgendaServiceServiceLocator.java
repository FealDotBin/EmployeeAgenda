/**
 * AgendaServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.ws;

public class AgendaServiceServiceLocator extends org.apache.axis.client.Service implements com.example.ws.AgendaServiceService {

    public AgendaServiceServiceLocator() {
    }


    public AgendaServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AgendaServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AgendaService
    private java.lang.String AgendaService_address = "http://localhost:8080/EmployeeAgendaService/services/AgendaService";

    public java.lang.String getAgendaServiceAddress() {
        return AgendaService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AgendaServiceWSDDServiceName = "AgendaService";

    public java.lang.String getAgendaServiceWSDDServiceName() {
        return AgendaServiceWSDDServiceName;
    }

    public void setAgendaServiceWSDDServiceName(java.lang.String name) {
        AgendaServiceWSDDServiceName = name;
    }

    public com.example.ws.AgendaService getAgendaService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AgendaService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAgendaService(endpoint);
    }

    public com.example.ws.AgendaService getAgendaService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.ws.AgendaServiceSoapBindingStub _stub = new com.example.ws.AgendaServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAgendaServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAgendaServiceEndpointAddress(java.lang.String address) {
        AgendaService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.ws.AgendaService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.ws.AgendaServiceSoapBindingStub _stub = new com.example.ws.AgendaServiceSoapBindingStub(new java.net.URL(AgendaService_address), this);
                _stub.setPortName(getAgendaServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AgendaService".equals(inputPortName)) {
            return getAgendaService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.example.com", "AgendaServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.example.com", "AgendaService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AgendaService".equals(portName)) {
            setAgendaServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
