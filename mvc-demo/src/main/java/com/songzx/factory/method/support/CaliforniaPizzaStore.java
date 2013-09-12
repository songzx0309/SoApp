package com.songzx.factory.method.support;

import com.songzx.factory.method.facet.Pizza;
import com.songzx.factory.method.facet.PizzaStore;
import com.songzx.factory.method.support.Constants;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		try {
			String className = Constants.CAL_MAP.get(type);
			if(className == null){
				throw new NullPointerException("No suitable class for " + type);
			}
			pizza = (Pizza) Class.forName(className).newInstance();
		}catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return pizza;
	}

}
