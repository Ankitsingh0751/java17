package com.lti.demos.annom;

class EmployeeSal1{
	
	interface PayTax1{
		int payTaxAmount();
		
	}
	
	public int amountPaid(int basicSal) {//method
		PayTax1 p=new PayTax1()
			{
			@Override
				public int payTaxAmount() {
				
				return 5000;
			}
			};
		return basicSal-p.payTaxAmount();
	}
	
}
public class AnnonymEx2 {

	public static void main(String[] args) {
		
		EmployeeSal1 e=new EmployeeSal1();
		double sal=e.amountPaid(500000);
		
		System.out.println(sal);
		

	}

}
