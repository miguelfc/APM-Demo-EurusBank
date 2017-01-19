/**
 * QueryAccountsWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eurus;

public class QueryAccountsWsLocator extends org.apache.axis.client.Service implements com.eurus.QueryAccountsWs {

    public QueryAccountsWsLocator() {
    }


    public QueryAccountsWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QueryAccountsWsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for queryAccountsWsHttpSoap11Endpoint
    private java.lang.String queryAccountsWsHttpSoap11Endpoint_address = "http://localhost:9087/queryAccountsWs/services/queryAccountsWs";

    public java.lang.String getqueryAccountsWsHttpSoap11EndpointAddress() {
        return queryAccountsWsHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String queryAccountsWsHttpSoap11EndpointWSDDServiceName = "queryAccountsWsHttpSoap11Endpoint";

    public java.lang.String getqueryAccountsWsHttpSoap11EndpointWSDDServiceName() {
        return queryAccountsWsHttpSoap11EndpointWSDDServiceName;
    }

    public void setqueryAccountsWsHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        queryAccountsWsHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.eurus.QueryAccountsWsPortType getqueryAccountsWsHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(queryAccountsWsHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getqueryAccountsWsHttpSoap11Endpoint(endpoint);
    }

    public com.eurus.QueryAccountsWsPortType getqueryAccountsWsHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.eurus.QueryAccountsWsSoap11BindingStub _stub = new com.eurus.QueryAccountsWsSoap11BindingStub(portAddress, this);
            _stub.setPortName(getqueryAccountsWsHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setqueryAccountsWsHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        queryAccountsWsHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.eurus.QueryAccountsWsPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.eurus.QueryAccountsWsSoap11BindingStub _stub = new com.eurus.QueryAccountsWsSoap11BindingStub(new java.net.URL(queryAccountsWsHttpSoap11Endpoint_address), this);
                _stub.setPortName(getqueryAccountsWsHttpSoap11EndpointWSDDServiceName());
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
        if ("queryAccountsWsHttpSoap11Endpoint".equals(inputPortName)) {
            return getqueryAccountsWsHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.eurus.com/", "queryAccountsWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.eurus.com/", "queryAccountsWsHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("queryAccountsWsHttpSoap11Endpoint".equals(portName)) {
            setqueryAccountsWsHttpSoap11EndpointEndpointAddress(address);
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
