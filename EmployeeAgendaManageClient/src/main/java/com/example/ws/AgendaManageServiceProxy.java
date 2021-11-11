package com.example.ws;

public class AgendaManageServiceProxy implements com.example.ws.AgendaManageService {
  private String _endpoint = null;
  private com.example.ws.AgendaManageService agendaManageService = null;
  
  public AgendaManageServiceProxy() {
    _initAgendaManageServiceProxy();
  }
  
  public AgendaManageServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAgendaManageServiceProxy();
  }
  
  private void _initAgendaManageServiceProxy() {
    try {
      agendaManageService = (new com.example.ws.AgendaManageServiceServiceLocator()).getAgendaManageService();
      if (agendaManageService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)agendaManageService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)agendaManageService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (agendaManageService != null)
      ((javax.xml.rpc.Stub)agendaManageService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.ws.AgendaManageService getAgendaManageService() {
    if (agendaManageService == null)
      _initAgendaManageServiceProxy();
    return agendaManageService;
  }
  
  public java.lang.String insertEmployee(java.lang.String id, java.lang.String name, java.lang.String surname, java.lang.String email, java.lang.String telephoneNumber, java.lang.String department) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.EmployeeAlreadyPresentException{
    if (agendaManageService == null)
      _initAgendaManageServiceProxy();
    return agendaManageService.insertEmployee(id, name, surname, email, telephoneNumber, department);
  }
  
  public java.lang.String updateEmployee(java.lang.String id, java.lang.String name, java.lang.String surname, java.lang.String email, java.lang.String department) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.EmployeeNotFoundException{
    if (agendaManageService == null)
      _initAgendaManageServiceProxy();
    return agendaManageService.updateEmployee(id, name, surname, email, department);
  }
  
  public java.lang.String deleteEmployee(java.lang.String id) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.EmployeeNotFoundException{
    if (agendaManageService == null)
      _initAgendaManageServiceProxy();
    return agendaManageService.deleteEmployee(id);
  }
  
  public java.lang.String deleteTelephoneNumber(java.lang.String id, java.lang.String telephoneNumber) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.TelephoneNumberCannotBeDeletedException, com.example.ws.TelephoneNumberNotFoundException, com.example.ws.EmployeeNotFoundException{
    if (agendaManageService == null)
      _initAgendaManageServiceProxy();
    return agendaManageService.deleteTelephoneNumber(id, telephoneNumber);
  }
  
  public java.lang.String insertTelephoneNumber(java.lang.String id, java.lang.String telephoneNumber) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.TelephoneNumberAlreadyPresentException, com.example.ws.EmployeeNotFoundException{
    if (agendaManageService == null)
      _initAgendaManageServiceProxy();
    return agendaManageService.insertTelephoneNumber(id, telephoneNumber);
  }
  
  
}