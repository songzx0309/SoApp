package com.songzx.rmi.support;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.songzx.rmi.facet.Calculator;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
	private static final long serialVersionUID = 1270697344885689680L;

	public CalculatorImpl() throws RemoteException {
		super();
	}

	@Override
	public double add(double arg1, double arg2) throws RemoteException {
		return arg1 + arg2;
	}

	@Override
	public double subtract(double arg1, double arg2) throws RemoteException {
		return arg1 - arg2;
	}

	@Override
	public double multiply(double arg1, double arg2) throws RemoteException {
		return arg1 * arg2;
	}

	@Override
	public double divide(double arg1, double arg2) throws RemoteException {
		if(arg2 == 0){
			throw new IllegalArgumentException("The dividend can't be zero.");
		}
		return arg1 / arg2;
	}

}
