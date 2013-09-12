package com.songzx.template.facet;

public abstract class CaffeineBeverage {
	
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiment();
	}
	
	public void boilWater() {
		System.out.println("Boiling water.");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup.");
	}
	
	public abstract void brew();
	
	public abstract void addCondiment();
}
