package com.songzx.decorator.support;

import com.songzx.decorator.ancestor.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
