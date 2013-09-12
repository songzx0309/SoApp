package com.songzx.weather.support;

import java.util.ArrayList;
import java.util.List;

import com.songzx.weather.facet.Observer;
import com.songzx.weather.facet.Subject;

public class WeatherData implements Subject {
	private float temperature;
	private float humidity;
	private float pressure;
	private List<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public double getTemperature() {
		return 0;
	}
	
	public double getHumidity() {
		return 0;
	}
	
	public double getPressuer() {
		return 0;
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasuerments(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
}
