package com.example.ws;

public class AgendaSearchServiceProxy implements com.example.ws.AgendaSearchService {
  private String _endpoint = null;
  private com.example.ws.AgendaSearchService agendaSearchService = null;
  
  public AgendaSearchServiceProxy() {
    _initAgendaSearchServiceProxy();
  }
  
  public AgendaSearchServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAgendaSearchServiceProxy();
  }
  
  private void _initAgendaSearchServiceProxy() {
    try {
      agendaSearchService = (new com.example.ws.AgendaSearchServiceServiceLocator()).getAgendaSearchService();
      if (agendaSearchService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)agendaSearchService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)agendaSearchService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (agendaSearchService != null)
      ((javax.xml.rpc.Stub)agendaSearchService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.ws.AgendaSearchService getAgendaSearchService() {
    if (agendaSearchService == null)
      _initAgendaSearchServiceProxy();
    return agendaSearchService;
  }
  
  public java.lang.String searchEmployee(java.lang.String id) throws java.rmi.RemoteException, com.example.ws.EmptyStringException, com.example.ws.EmployeeNotFoundException{
    if (agendaSearchService == null)
      _initAgendaSearchServiceProxy();
    return agendaSearchService.searchEmployee(id);
  }
  
  
}