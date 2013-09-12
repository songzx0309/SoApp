package com.songzx.factory.method.support;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	public static final Map<String, String> CAL_MAP = new HashMap<String, String>(){

		private static final long serialVersionUID = 1L;

		{
			put("cheese","com.songzx.factory.method.support.CaliforniaCheesePizza");
			put("clam","com.songzx.factory.method.support.CaliforniaClamPizza");
			put("pepperoni","com.songzx.factory.method.support.CaliforniaPepperoniPizza");
			put("veggie","com.songzx.factory.method.support.CaliforniaVeggiePizza");
		}
	};
}
