package com.lti.interfaceex;



public class UserApp {

	static {
		System.out.println("Hello I am Static");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TempEmp te=new TempEmp(101,"JAY",10.00,2000.00);
		te.calSal();
		
		Person p=new PermEmp(102,"VIJAY",60000.00);
		p.calSal();
		

	}

}
