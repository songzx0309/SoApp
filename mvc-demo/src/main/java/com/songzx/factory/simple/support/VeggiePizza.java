package com.songzx.factory.simple.support;

import com.songzx.factory.simple.facet.Pizza;

public class VeggiePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare veggie for pizza.");
	}

	@Override
	public void bake() {
		System.out.println("Bake veggie pizza.");
	}

	@Override
	public void cut() {
		System.out.println("Cut veggie pizza.");
	}

	@Override
	public void box() {
		System.out.println("Box veggie pizza.");
	}

}
