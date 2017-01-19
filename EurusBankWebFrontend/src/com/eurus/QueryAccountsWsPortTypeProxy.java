package com.eurus;

public class QueryAccountsWsPortTypeProxy implements com.eurus.QueryAccountsWsPortType {
  private String _endpoint = null;
  private com.eurus.QueryAccountsWsPortType queryAccountsWsPortType = null;
  
  public QueryAccountsWsPortTypeProxy() {
    _initQueryAccountsWsPortTypeProxy();
  }
  
  public QueryAccountsWsPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initQueryAccountsWsPortTypeProxy();
  }
  
  private void _initQueryAccountsWsPortTypeProxy() {
    try {
      queryAccountsWsPortType = (new com.eurus.QueryAccountsWsLocator()).getqueryAccountsWsHttpSoap11Endpoint();
      if (queryAccountsWsPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)queryAccountsWsPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)queryAccountsWsPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (queryAccountsWsPortType != null)
      ((javax.xml.rpc.Stub)queryAccountsWsPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.eurus.QueryAccountsWsPortType getQueryAccountsWsPortType() {
    if (queryAccountsWsPortType == null)
      _initQueryAccountsWsPortTypeProxy();
    return queryAccountsWsPortType;
  }
  
  public java.lang.String queryAccountsByName(java.lang.String name) throws java.rmi.RemoteException{
    if (queryAccountsWsPortType == null)
      _initQueryAccountsWsPortTypeProxy();
    return queryAccountsWsPortType.queryAccountsByName(name);
  }
  
  public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException{
    if (queryAccountsWsPortType == null)
      _initQueryAccountsWsPortTypeProxy();
    return queryAccountsWsPortType.sayHello(name);
  }
  
  public java.lang.String queryAccountsByNameAndBranch(java.lang.String name, java.lang.String branch) throws java.rmi.RemoteException{
    if (queryAccountsWsPortType == null)
      _initQueryAccountsWsPortTypeProxy();
    return queryAccountsWsPortType.queryAccountsByNameAndBranch(name, branch);
  }
  
  
}