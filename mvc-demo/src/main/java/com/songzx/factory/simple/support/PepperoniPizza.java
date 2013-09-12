package com.songzx.factory.simple.support;

import com.songzx.factory.simple.facet.Pizza;

public class PepperoniPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare pepperoni for pizza.");
	}

	@Override
	public void bake() {
		System.out.println("Bake pepperoni pizza.");
	}

	@Override
	public void cut() {
		System.out.println("Cut pepperoni pizza.");
	}

	@Override
	public void box() {
		System.out.println("Box pepperoni pizza.");
	}

}
