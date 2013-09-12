package com.songzx.factory.simple;

import com.songzx.factory.simple.facet.Pizza;
import com.songzx.factory.simple.support.CheesePizza;
import com.songzx.factory.simple.support.ClamPizza;
import com.songzx.factory.simple.support.PepperoniPizza;
import com.songzx.factory.simple.support.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		} else if(type.equals("veggie")){
			pizza = new VeggiePizza();
		} else if(type.equals("clam")){
			pizza = new ClamPizza();
		} else if(type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		}
		return pizza;
	}
	
}
