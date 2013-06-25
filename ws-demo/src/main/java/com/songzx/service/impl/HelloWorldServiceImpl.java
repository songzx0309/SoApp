package com.songzx.service.impl;

import javax.jws.WebService;

import com.songzx.service.HelloWorldService;

@WebService(endpointInterface = "com.songzx.service.HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String sayHello(String request) {
		return "Hello World " + request;
	}

}
