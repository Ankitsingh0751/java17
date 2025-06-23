package com.lti.demos;

class PayTax// outer class
{
	int empId=101;
	double amount=50000.00;
	
	class PanCard{//inner class 
		int panNo=12345;
	}
	
	static class PanCards{// static inner class
		String orgName="PanIndia";
	}
}
public class OuterInnerClsEx3 {

	public static void main(String[] args) {
		// access inner class
		PayTax e=new PayTax(); //Step 1: create outer class object
		PayTax.PanCard card=e.new PanCard();//Step 2 : Outerclass.innerclass objName=outer_obj.new innerclass()
		System.out.println(card.panNo + " "+e.empId+" "+e.amount);
		System.out.println("----------------------");
	
		PayTax.PanCard card1=new PayTax().new PanCard();
		System.out.println(card1.panNo);
		
		System.out.println("-------------------------");
		//access inner static class
		PayTax.PanCards card2=new PayTax.PanCards();// OuterClass.InnerStaticClass objName=new outerClass.innerStaticClass();
		System.out.println(card2.orgName);
		
		
		

	}

}
