package com.songzx.decorator.support.condiment;

import com.songzx.decorator.ancestor.Beverage;
import com.songzx.decorator.support.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + .15;
	}

}
