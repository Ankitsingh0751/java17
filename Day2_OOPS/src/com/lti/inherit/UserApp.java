package com.lti.inherit;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person p=new Person(100,"ABCD");
//		System.out.println(p);
		
		PermEmp pe=new PermEmp(108,"RanVijay",50000.00);
//		pe.setPersonId(101);
//		pe.setPersonName("Jay");
//		pe.setBasicSal(500000.00);
		
		System.out.println(pe);
		pe.calSal();
		
		System.out.println("-----------------------------------");
		TempEmp te=new TempEmp();
		te.setPersonId(102);
		te.setPersonName("Vijay");
		te.setNoDays(10.0);
		te.setPerDaySal(2000.00);
		
		System.out.println(te);
		te.calSal();

	}

}
