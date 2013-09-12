package com.songzx.single.basic.bean;

public class MyObj {
	private static MyObj obj;
	
	
	/**
	 * Build a <code>private</code> constructor in order to make it cann't be invoked by others.
	 */
	private MyObj() {
		System.out.println(this);
	}
	
	/**
	 * Use <code>static</code> and <code>synchronized</code> modifier
	 * to make it can be invoked directly and thread safe.
	 * 
	 * @return obj
	 */
	public static synchronized MyObj getInstance() {
		if(obj == null){
			obj = new MyObj();
		}
		return obj;
	}
}
