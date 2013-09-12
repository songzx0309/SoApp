package com.songzx.command.support;

import com.songzx.command.facet.Command;

public class RemoteController {
	private Command command;
	
	public RemoteController(){

	}
	
	public void buttonWrapped() {
		command.execute();
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
}
