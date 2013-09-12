package com.songzx.template.test;

import com.songzx.template.facet.CaffeineBeverage;
import com.songzx.template.support.Coffee;
import com.songzx.template.support.Tea;

public class AppTest {

	public static void main(String[] args) {
		CaffeineBeverage coffee = new Coffee();
		coffee.prepareRecipe();
		System.out.println();
		CaffeineBeverage tea = new Tea();
		tea.prepareRecipe();
	}

}
