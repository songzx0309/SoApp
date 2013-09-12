package com.songzx.factory.method.support;

import com.songzx.factory.method.facet.Pizza;

public class ChicagoClamPizza extends Pizza {

	public ChicagoClamPizza() {
		name = "Chicago clam Pizza";
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
}
