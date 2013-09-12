package com.songzx.factory.method.support;

import com.songzx.factory.method.facet.Pizza;
import com.songzx.factory.method.facet.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")){
			pizza = new NYCheesePizza();
		} else if(type.equals("veggie")){
			pizza = new NYVeggiePizza();
		} else if(type.equals("clam")){
			pizza = new NYClamPizza();
		} else if(type.equals("pepperoni")){
			pizza = new NYPepperoniPizza();
		}
		return pizza;
	}

}
