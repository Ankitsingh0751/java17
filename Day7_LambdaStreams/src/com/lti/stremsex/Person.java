package com.lti.stremsex;

public class Person {
	private String perName;
	private int perAge;
	public Person() {
		super();
	}
	public Person(String perName, int perAge) {
		super();
		this.perName = perName;
		this.perAge = perAge;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public int getPerAge() {
		return perAge;
	}
	public void setPerAge(int perAge) {
		this.perAge = perAge;
	}
	@Override
	public String toString() {
		return "\nPerson [perName=" + perName + ", perAge=" + perAge + "]";
	}
	
	

}
