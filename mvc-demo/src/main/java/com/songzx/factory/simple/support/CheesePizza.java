package com.songzx.factory.simple.support;

import com.songzx.factory.simple.facet.Pizza;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare cheese for pizza.");
	}

	@Override
	public void bake() {
		System.out.println("Bake cheese pizza.");
	}

	@Override
	public void cut() {
		System.out.println("Cut cheese pizza.");
	}

	@Override
	public void box() {
		System.out.println("Box cheese pizza.");
	}

}
