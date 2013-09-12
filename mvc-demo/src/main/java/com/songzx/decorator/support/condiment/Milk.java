package com.songzx.decorator.support.condiment;

import com.songzx.decorator.ancestor.Beverage;
import com.songzx.decorator.support.CondimentDecorator;

public class Milk extends CondimentDecorator {
	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + .2;
	}

}
