package com.lti.demos.annom;


interface PayTax
{
	int payTaxAmount();
	
}
class PayTaxImpl implements PayTax{

	@Override
	public int payTaxAmount() {
		// TODO Auto-generated method stub
		return 5000;
	}
	
}

class EmployeeSal{
	public int pay(int empId,PayTax p) {
		return amountPaid(50000,p);
	}
	
	public int amountPaid(int basicSal,PayTax p) {
		return basicSal-p.payTaxAmount();
	}
	
}
public class AnnonymEx1 {

	public static void main(String[] args) {
		
		EmployeeSal e=new EmployeeSal();
		PayTaxImpl p=new PayTaxImpl();
		double sal=e.pay(101, p);
		System.out.println(sal);
		

	}

}
