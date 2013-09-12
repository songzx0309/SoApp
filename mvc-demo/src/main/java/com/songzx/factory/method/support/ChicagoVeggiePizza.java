package com.songzx.factory.method.support;

import com.songzx.factory.method.facet.Pizza;

public class ChicagoVeggiePizza extends Pizza {

	public ChicagoVeggiePizza() {
		name = "Chicago Veggie Pizza";
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
}
