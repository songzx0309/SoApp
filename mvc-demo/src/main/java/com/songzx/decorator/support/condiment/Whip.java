package com.songzx.decorator.support.condiment;

import com.songzx.decorator.ancestor.Beverage;
import com.songzx.decorator.support.CondimentDecorator;

public class Whip extends CondimentDecorator {
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + .1;
	}

}
