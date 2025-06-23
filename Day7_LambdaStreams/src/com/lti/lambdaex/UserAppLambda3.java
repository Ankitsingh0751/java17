package com.lti.lambdaex;

interface MyInterface{
	String formatStr(String inputStr);
}

public class UserAppLambda3 {

	public static void main(String[] args) {

		MyInterface mif=(inputStr)->inputStr.replaceAll(",","*");
		String result=mif.formatStr("R,O,H,I,T");
		System.out.println(result);
	}

}
