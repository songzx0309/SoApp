package com.songzx.rmi.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import com.songzx.rmi.facet.Calculator;
import com.songzx.rmi.support.CalculatorImpl;

public class CalculatorServer {
	public static final String RMI_PROTOCOL = "rmi://";
	public static String host = "localhost";
	public static int port = 6543;

	public CalculatorServer() {
		initlize();
		testBindService();
	}
	
	public void initlize() {
		// using this step can omit generating stub
		try {
			LocateRegistry.createRegistry(port);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public void bindService(String serviceName, Remote obj) {
		String name = RMI_PROTOCOL + host + ":" + port + "/"+ serviceName;
		System.out.println("Service [" + name + "] has been established.");
		try {
			Naming.bind(name, obj);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		}
	}
	
	public void testBindService() {
		try {
			Calculator c = new CalculatorImpl();
			bindService("CalculatorService",c);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new CalculatorServer();
	}

}
