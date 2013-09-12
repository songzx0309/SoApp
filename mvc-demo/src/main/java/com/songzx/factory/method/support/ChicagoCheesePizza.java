package com.songzx.factory.method.support;

import com.songzx.factory.method.facet.Pizza;

public class ChicagoCheesePizza extends Pizza {

	public ChicagoCheesePizza() {
		name = "Chicago Cheese Pizza";
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
