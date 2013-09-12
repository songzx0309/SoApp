package com.songzx.factory.simple.test;

import com.songzx.factory.simple.PizzaStore;
import com.songzx.factory.simple.SimplePizzaFactory;

public class AppTest {

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore ps = new PizzaStore(factory);
		ps.orderPizza("veggie");
	}

}
