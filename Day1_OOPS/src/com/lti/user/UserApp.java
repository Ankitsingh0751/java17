package com.lti.user;

import com.lti.entity.Employee;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(101,"Jay",50000.00);
		//e1.setData(101,"Jay",50000.00);
//		e1.setEmpId(101);
//		e1.setEmpName("Jay");
		e1.setEmpSal(900000);
		System.out.println(e1);
		
		Employee e2=new Employee();
		System.out.println(e2);

	}

}
