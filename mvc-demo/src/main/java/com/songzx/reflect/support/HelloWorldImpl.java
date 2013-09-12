package com.songzx.reflect.support;

import com.songzx.reflect.facet.HelloWorld;

public class HelloWorldImpl implements HelloWorld {
	private String sex;
	private int age;
	
	public HelloWorldImpl() {
		
	}
	
	public HelloWorldImpl(String sex, int age) {
		this.sex = sex;
		this.age = age;
	}
	
	@Override
	public void greet() {
		System.out.println("Hello World!");
	}

	@Override
	public String sayHello(String name) {
		return "Hello " + name + "!";
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
