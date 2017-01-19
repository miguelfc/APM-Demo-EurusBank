/**
 * QueryAccountsWsPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eurus;

public interface QueryAccountsWsPortType extends java.rmi.Remote {
    public java.lang.String queryAccountsByName(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String queryAccountsByNameAndBranch(java.lang.String name, java.lang.String branch) throws java.rmi.RemoteException;
}
