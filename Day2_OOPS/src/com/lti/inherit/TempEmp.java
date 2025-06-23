package com.lti.inherit;

public class TempEmp extends Person{
	
	private double noDays;
	private double perDaySal;
	public TempEmp() {
		super();
	}
	public TempEmp(int personId, String personName,double noDays,double perDaySal) {
		super(personId, personName);
		// TODO Auto-generated constructor stub
		this.noDays=noDays;
		this.perDaySal=perDaySal;
	}
	public double getNoDays() {
		return noDays;
	}
	public void setNoDays(double noDays) {
		this.noDays = noDays;
	}
	public double getPerDaySal() {
		return perDaySal;
	}
	public void setPerDaySal(double perDaySal) {
		this.perDaySal = perDaySal;
	}
	
	
	@Override
	public String toString() {
		return "TempEmp [noDays=" + noDays + ", perDaySal=" + perDaySal + "]";
	}
	@Override
	public void calSal() {
		// TODO Auto-generated method stub
		double salary=this.noDays*this.perDaySal;
		System.out.println("The Salary of Temporary Employee is " +salary);
		
		
	}
	
	

}
