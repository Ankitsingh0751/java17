package com.lti.excpdemos;

class MyException extends Exception{
	public String getMessage() {
		return "Number is Odd!!";
	}
}

class MySalException extends Exception{
	public String getMessage() {
		return "salary should be greater than 10k";
	}
}


public class UserDefExcp {
	
	static void evenodd(int number) throws MyException {
		if(number%2==0)
			System.out.println("Number is Even : "+number);
		else
			throw new MyException();
			
	}
	
	static void validate(int num) throws MyException{
		evenodd(num);
	}
	
	static void validateSal(long sal) throws MySalException{
		if(sal>=10000)
			System.out.println("Salary valid");
		else
			throw new MySalException();
	}
	
	public static void main(String[] args) {
		try {
			validate(13);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			long sal = 5000;
			validateSal(sal);
		} catch (MySalException e) {
			System.out.println(e.getMessage());
		}
	}

	
	
}
