package com.lti.inherit;

public class PermEmp extends Person{
	
	private double basicSal;

	public PermEmp() {
		super();
	}
	
	

	public PermEmp(int personId, String personName,double basicSal) {
		super(personId, personName);
		this.basicSal=basicSal;
		// TODO Auto-generated constructor stub
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	@Override
	public String toString() {
		return "PermEmp [ PerssonId=" + super.getPersonId()+ " personName= " + super.getPersonName()+ " basicSal=" + basicSal + "]";
	}



	@Override
	public void calSal() {
		// TODO Auto-generated method stub
		double salary=this.basicSal;
		System.out.println("The Salary of Temporary Employee is " +salary);
		
	}
	
	
	
	

}
