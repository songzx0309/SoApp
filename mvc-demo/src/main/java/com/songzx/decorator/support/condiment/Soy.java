package com.songzx.decorator.support.condiment;

import com.songzx.decorator.ancestor.Beverage;
import com.songzx.decorator.support.CondimentDecorator;

public class Soy extends CondimentDecorator {
	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	@Override
	public double cost() {
		return beverage.cost() + .25;
	}
	
}
