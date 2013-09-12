package com.songzx.decorator.support;

import com.songzx.decorator.ancestor.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast";
	}
	
	@Override
	public double cost() {
		return 1.25;
	}

}
