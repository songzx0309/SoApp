package com.songzx.factory.simple.support;

import com.songzx.factory.simple.facet.Pizza;

public class ClamPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare clam for pizza.");
	}

	@Override
	public void bake() {
		System.out.println("Bake clam pizza.");
	}

	@Override
	public void cut() {
		System.out.println("Cut clam pizza.");
	}

	@Override
	public void box() {
		System.out.println("Box clam pizza.");
	}

}
