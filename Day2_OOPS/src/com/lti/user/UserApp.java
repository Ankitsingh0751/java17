package com.lti.user;

import com.lti.entity.Product;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p=new Product();
		p.setPrdId(101);
		p.setPrdName("Mobile");
		p.setPrdCost(50000.00);
		
		System.out.println(p);
		System.out.println("The Bill Amount to be paid is "+p.printBill(4));
		
		
		
		Product p2=new Product(102,"Laptop",60000.00);
		System.out.println(p2);

	}

}
