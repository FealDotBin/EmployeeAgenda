package com.example.ws;

public class AgendaServiceProxy implements com.example.ws.AgendaService {
  private String _endpoint = null;
  private com.example.ws.AgendaService agendaService = null;
  
  public AgendaServiceProxy() {
    _initAgendaServiceProxy();
  }
  
  public AgendaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAgendaServiceProxy();
  }
  
  private void _initAgendaServiceProxy() {
    try {
      agendaService = (new com.example.ws.AgendaServiceServiceLocator()).getAgendaService();
      if (agendaService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)agendaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)agendaService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (agendaService != null)
      ((javax.xml.rpc.Stub)agendaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.ws.AgendaService getAgendaService() {
    if (agendaService == null)
      _initAgendaServiceProxy();
    return agendaService;
  }
  
  public java.lang.String deleteTelephoneNumber(java.lang.String id, java.lang.String telephoneNumber) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.TelephoneNumberCannotBeDeletedException, com.example.ws.TelephoneNumberNotFoundException, com.example.ws.EmployeeNotFoundException{
    if (agendaService == null)
      _initAgendaServiceProxy();
    return agendaService.deleteTelephoneNumber(id, telephoneNumber);
  }
  
  public java.lang.String insertTelephoneNumber(java.lang.String id, java.lang.String telephoneNumber) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.TelephoneNumberAlreadyPresentException, com.example.ws.EmployeeNotFoundException{
    if (agendaService == null)
      _initAgendaServiceProxy();
    return agendaService.insertTelephoneNumber(id, telephoneNumber);
  }
  
  public java.lang.String searchEmployee(java.lang.String id) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.EmployeeNotFoundException{
    if (agendaService == null)
      _initAgendaServiceProxy();
    return agendaService.searchEmployee(id);
  }
  
  public java.lang.String insertEmployee(java.lang.String id, java.lang.String name, java.lang.String surname, java.lang.String email, java.lang.String telephoneNumber, java.lang.String department) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.EmployeeAlreadyPresentException{
    if (agendaService == null)
      _initAgendaServiceProxy();
    return agendaService.insertEmployee(id, name, surname, email, telephoneNumber, department);
  }
  
  public java.lang.String deleteEmployee(java.lang.String id) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.EmployeeNotFoundException{
    if (agendaService == null)
      _initAgendaServiceProxy();
    return agendaService.deleteEmployee(id);
  }
  
  public java.lang.String updateEmployee(java.lang.String id, java.lang.String name, java.lang.String surname, java.lang.String email, java.lang.String department) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.EmployeeNotFoundException{
    if (agendaService == null)
      _initAgendaServiceProxy();
    return agendaService.updateEmployee(id, name, surname, email, department);
  }
  
  
}