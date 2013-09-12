package com.songzx.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.songzx.rmi.facet.Calculator;

public class CalculatorClient {

	public static void main(String[] args) {
		try {
			Calculator c = (Calculator) Naming.lookup("rmi://localhost:6543/CalculatorService");
			System.out.println(c.add(3, 5));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

}
