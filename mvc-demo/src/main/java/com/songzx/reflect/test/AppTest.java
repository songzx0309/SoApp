package com.songzx.reflect.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class AppTest {

	@Test
	public void test1() {
		try {
			Class<?> c = Class.forName("com.songzx.reflect.support.HelloWorldImpl");
			System.out.println(c.getName());
			Method[] methods = c.getDeclaredMethods();
			Field[] fields = c.getDeclaredFields();
			Field[] fields1 = c.getFields();
			System.out.println("***   methods   ***");
			for(Method m: methods){
				System.out.println(m);
			}
			System.out.println("***   fields   ***");
			for(Field f: fields){
				System.out.println(f);
			}
			System.out.println("***   fields1   ***");
			for(Field f: fields1){
				System.out.println(f);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		try {
			Class<?> c = Class.forName("com.songzx.reflect.support.HelloWorldImpl");
			System.out.println(c.getName());
			Method m1 = c.getMethod("greet");
			Object o1 = m1.invoke(c.newInstance());
			System.out.println(o1);
			Method m2 = c.getMethod("sayHello", String.class);
			Object o2 = m2.invoke(c.newInstance(), "songzx");
			System.out.println(o2);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	@Test
	public void test3() {
		List<String> l = new ArrayList<String>();
		String str1 = "hello";
		String str2 = "hd";
		String str3 = "Hello";
		String str4 = "bibiq";
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		l.add(str1);
		l.add(str2);
		l.add(str3);
		l.add(str4);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		for(String s:l){
			System.out.println(s);
		}
	}
	
}
