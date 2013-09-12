package com.songzx.command.test;

import org.junit.Test;

import com.songzx.command.facet.Command;
import com.songzx.command.support.Garage;
import com.songzx.command.support.GarageOpenCommand;
import com.songzx.command.support.Light;
import com.songzx.command.support.LightOnCommand;
import com.songzx.command.support.RemoteController;

public class AppTest {

	@Test
	public void test1() {
		Light light = new Light();
		Garage garage = new Garage();
		Command c1 = new LightOnCommand(light);
		Command c2 = new GarageOpenCommand(garage);
		RemoteController rc = new RemoteController();
		rc.setCommand(c1);
		rc.buttonWrapped();
		
		rc.setCommand(c2);
		rc.buttonWrapped();
	}
	
}
