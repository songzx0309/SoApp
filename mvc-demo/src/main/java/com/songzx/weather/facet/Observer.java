package com.songzx.weather.facet;

public interface Observer {
	
	public void update(float temperature, float humidity, float pressure);
	
}
