package com.songzx.template.support;

import com.songzx.template.facet.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Steeping the Tea.");
	}

	@Override
	public void addCondiment() {
		System.out.println("Adding Lemon.");
	}

}
