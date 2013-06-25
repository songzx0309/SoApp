package com.songzx;

import javax.xml.ws.BindingProvider;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

import com.songzx.service.HelloWorldService;

public class TestWs {
	private JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	private String wsdlUrl = "http://localhost:8080/ws-demo/services/helloWorldService";
	
	@Test
	public void testHelloWord() {
		factory.setServiceClass(HelloWorldService.class);
		factory.setAddress(wsdlUrl);
		factory.setUsername("webservices");
		factory.setPassword("webservices-pwd");
		HelloWorldService hw = (HelloWorldService) factory.create();
		
//		BindingProvider bp = (BindingProvider) hw;
//      bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY,"webservices");
//      bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "webservices-pwd");
//      bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,wsdlUrl);
		
		
		String result = hw.sayHello("songzx");
		System.out.println(result);
	}
	
}
