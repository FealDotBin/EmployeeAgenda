/**
 * AgendaManageServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.ws;

public class AgendaManageServiceServiceLocator extends org.apache.axis.client.Service implements com.example.ws.AgendaManageServiceService {

    public AgendaManageServiceServiceLocator() {
    }


    public AgendaManageServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AgendaManageServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AgendaManageService
    private java.lang.String AgendaManageService_address = "http://localhost:8080/EmployeeAgendaService/services/AgendaManageService";

    public java.lang.String getAgendaManageServiceAddress() {
        return AgendaManageService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AgendaManageServiceWSDDServiceName = "AgendaManageService";

    public java.lang.String getAgendaManageServiceWSDDServiceName() {
        return AgendaManageServiceWSDDServiceName;
    }

    public void setAgendaManageServiceWSDDServiceName(java.lang.String name) {
        AgendaManageServiceWSDDServiceName = name;
    }

    public com.example.ws.AgendaManageService getAgendaManageService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AgendaManageService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAgendaManageService(endpoint);
    }

    public com.example.ws.AgendaManageService getAgendaManageService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.ws.AgendaManageServiceSoapBindingStub _stub = new com.example.ws.AgendaManageServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAgendaManageServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAgendaManageServiceEndpointAddress(java.lang.String address) {
        AgendaManageService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.ws.AgendaManageService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.ws.AgendaManageServiceSoapBindingStub _stub = new com.example.ws.AgendaManageServiceSoapBindingStub(new java.net.URL(AgendaManageService_address), this);
                _stub.setPortName(getAgendaManageServiceWSDDServiceName());
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
        if ("AgendaManageService".equals(inputPortName)) {
            return getAgendaManageService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.example.com", "AgendaManageServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.example.com", "AgendaManageService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AgendaManageService".equals(portName)) {
            setAgendaManageServiceEndpointAddress(address);
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
