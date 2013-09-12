package com.songzx.single.basic.test;

import org.junit.Test;

import com.songzx.single.basic.bean.MyObj;

public class AppTest {

	@Test
	public void test() {
		MyObj o1 = MyObj.getInstance();
		System.out.println(Thread.currentThread() + ": " + o1);
		MyObj o2 = MyObj.getInstance();
		System.out.println(Thread.currentThread() + ": " + o2 );
		System.out.println("o1 == o2 : " + (o1 == o2));
	}
	
	@Test
	public void test1() {
		new Thread(){
			public void run() {
				MyObj o1 = MyObj.getInstance();
				System.out.println(Thread.currentThread() + ": o1 --> " + o1);
			}
		}.start();
		new Thread(){
			public void run() {
				MyObj o2 = MyObj.getInstance();
				System.out.println(Thread.currentThread() + ": o2 --> " + o2 );
			}
		}.start();
	}
}
