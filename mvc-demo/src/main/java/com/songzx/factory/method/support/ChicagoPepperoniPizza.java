package com.songzx.factory.method.support;

import com.songzx.factory.method.facet.Pizza;

public class ChicagoPepperoniPizza extends Pizza {

	public ChicagoPepperoniPizza() {
		name = "Chicago Pepperoni Pizza";
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
}
