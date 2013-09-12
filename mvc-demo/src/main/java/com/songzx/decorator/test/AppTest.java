package com.songzx.decorator.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.songzx.decorator.ancestor.Beverage;
import com.songzx.decorator.support.Decaf;
import com.songzx.decorator.support.condiment.Milk;

public class AppTest {

	@Test
	public void test() {
		Beverage beverage = new Milk(new Decaf());
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
	}

	@Test
	public void test1() throws IOException {
		int c;
		InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
		while((c = in.read()) != -1){
			System.out.print((char)c);
		}
		in.close();
	}
	
	/**
	 * π=4*∑(-1)^n+1/(2n-1) 或者写为: π=4*( 1-1/3+1/5-1/7+…) 
	 * 也可以得到：πn =πn-1+(-1)^n+1/(2n-1)，也就是可以通过迭代前面的π值去求当前π值。
	 */
	@Test
	public void test2() {
		long basicTime = System.currentTimeMillis();
		long startTime = System.currentTimeMillis();
		double pi = 0.0;
		for (double i = 1.0; i < 100000001d; i++) {
			pi += Math.pow(-1, i + 1) / (2 * i - 1);
//			long now = System.currentTimeMillis();
//			if(now - startTime > 1000){
//				System.out.println(i + "\t" + pi + "\t" + (pi * 4));
//				startTime = now;
//			}
		}
		long currentTime = System.currentTimeMillis();
		System.out.println("the result π: " + 4 * pi);
		System.out.println("total spent: " + (currentTime - basicTime));
	}
}
