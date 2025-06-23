package com.lti.demos;

import java.util.ArrayList;

//T- type At

public class DataHolder<T> {
	
	private ArrayList<T> data;
	public DataHolder() {
		data=new ArrayList();
	}
	
	public void add(T value) {
		data.add(value);
		
	}
	public T get(int ind) {
		return data.get(ind);
	}
	

}
