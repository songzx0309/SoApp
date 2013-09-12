package com.songzx.rmi.facet;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
	
	public double add(double arg1, double arg2) throws RemoteException;
	
	public double subtract(double arg1, double arg2) throws RemoteException;
	
	public double multiply(double arg1, double arg2) throws RemoteException;
	
	public double divide(double arg1, double arg2) throws Exception, RemoteException;
}
