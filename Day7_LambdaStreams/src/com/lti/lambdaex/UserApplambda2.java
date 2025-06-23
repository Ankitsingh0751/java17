package com.lti.lambdaex;

//lambda works with functional interface;

interface Power{
	double pow(double x,double y);
}

public class UserApplambda2 {

	public static void main(String[] args) {

		Power p=(x,y)->Math.pow(x,y);
		double result=p.pow(4, 2);
		System.out.println(result);
		

	}

}

