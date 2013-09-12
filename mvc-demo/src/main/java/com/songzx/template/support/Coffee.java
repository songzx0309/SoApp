package com.songzx.template.support;

import com.songzx.template.facet.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
	
	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter.");
	}

	@Override
	public void addCondiment() {
		System.out.println("Adding Sugar and Milk.");
	}
}
