package com.songzx.factory.method.support;

import com.songzx.factory.method.facet.Pizza;
import com.songzx.factory.method.facet.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("cheese")){
			pizza = new ChicagoCheesePizza();
		} else if(type.equals("veggie")){
			pizza = new ChicagoVeggiePizza();
		} else if(type.equals("clam")){
			pizza = new ChicagoClamPizza();
		} else if(type.equals("pepperoni")){
			pizza = new ChicagoPepperoniPizza();
		}
		return pizza;
	}

}
