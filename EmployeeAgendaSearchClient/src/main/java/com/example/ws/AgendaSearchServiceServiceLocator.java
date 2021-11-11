/**
 * AgendaSearchServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.ws;

public class AgendaSearchServiceServiceLocator extends org.apache.axis.client.Service implements com.example.ws.AgendaSearchServiceService {

    public AgendaSearchServiceServiceLocator() {
    }


    public AgendaSearchServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AgendaSearchServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AgendaSearchService
    private java.lang.String AgendaSearchService_address = "http://localhost:8080/EmployeeAgendaService/services/AgendaSearchService";

    public java.lang.String getAgendaSearchServiceAddress() {
        return AgendaSearchService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AgendaSearchServiceWSDDServiceName = "AgendaSearchService";

    public java.lang.String getAgendaSearchServiceWSDDServiceName() {
        return AgendaSearchServiceWSDDServiceName;
    }

    public void setAgendaSearchServiceWSDDServiceName(java.lang.String name) {
        AgendaSearchServiceWSDDServiceName = name;
    }

    public com.example.ws.AgendaSearchService getAgendaSearchService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AgendaSearchService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAgendaSearchService(endpoint);
    }

    public com.example.ws.AgendaSearchService getAgendaSearchService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.ws.AgendaSearchServiceSoapBindingStub _stub = new com.example.ws.AgendaSearchServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAgendaSearchServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAgendaSearchServiceEndpointAddress(java.lang.String address) {
        AgendaSearchService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.ws.AgendaSearchService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.ws.AgendaSearchServiceSoapBindingStub _stub = new com.example.ws.AgendaSearchServiceSoapBindingStub(new java.net.URL(AgendaSearchService_address), this);
                _stub.setPortName(getAgendaSearchServiceWSDDServiceName());
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
        if ("AgendaSearchService".equals(inputPortName)) {
            return getAgendaSearchService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.example.com", "AgendaSearchServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.example.com", "AgendaSearchService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AgendaSearchService".equals(portName)) {
            setAgendaSearchServiceEndpointAddress(address);
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
