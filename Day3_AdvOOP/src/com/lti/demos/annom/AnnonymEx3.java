package com.lti.demos.annom;

//double final pi = 3.14;

//int x = 100 ; // effectivelt final ?
//x =200 ; not final , treat it normal variable
//if u dont any other value to this x - remains as effectively final
class EmployeeSal2
{
  interface PayTax2
  {
      int payTaxAmount();    
  }    
  public int pay(int basicSal) {
  	
  	int y = 200; //effectively fianal varib;ae
  	//y=600;
  	//method local inner class // can extends object
      return amountPaid(basicSal, new PayTax2() {
          @Override
          public int payTaxAmount() {
         //  y=300;
          	System.out.println(y);
          	return 5000;
          }
          @Override
          public String toString()
          {
          	return "hello ";
          }
      });
  }
 public int amountPaid(int basicSal, PayTax2 p) {
      return basicSal - p.payTaxAmount();
  }
}
public class AnnonymEx3 {
  public static void main(String[] args) {
      
      EmployeeSal2 e= new EmployeeSal2();        
      double sal=e.pay(50000);
      System.out.println(sal);    
  }



}
