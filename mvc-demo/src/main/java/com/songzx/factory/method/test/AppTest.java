package com.songzx.factory.method.test;


import com.songzx.factory.method.facet.Pizza;
import com.songzx.factory.method.facet.PizzaStore;
import com.songzx.factory.method.support.CaliforniaPizzaStore;
import com.songzx.factory.method.support.NYPizzaStore;

public class AppTest {

	public static void main(String[] args) {
		PizzaStore ps = new NYPizzaStore();
		Pizza piz1 = ps.orderPizza("veggie");
		System.out.println("I have ordered a " + piz1.getName() + "\n");
		PizzaStore ps1 = new CaliforniaPizzaStore();
		Pizza piz2 = ps1.orderPizza("veggie");
		System.out.println("You have ordered a " + piz2.getName());
	}

}
