package com.lti.basics1;

public class Demo2Typeconversionm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Numeric Promotion Rules
		// 1. If two values have different data types, Java will automatically promote	
		//one of the values to the larger of the two data types.
		// 2. If one of the values is integral and the other is floating-point, Java
		// will automatically promote the integral value to the floating-point value’s	 data type.

		//	3. Smaller data types, namely byte, short, and char, 
//are first promoted to int any time they’re used with a Java binary arithmetic operator,
				// even if neither of the operands is int.

		// 4. After all promotion has occurred and the operands have the same data type, 
		  //the resulting value will have the same data type as its promoted operands.

	short a = 100;
    short b = 20;
    int c =a + b;
    System.out.println(c);
    

    int x = 5;
    int y = 3;
    float result = (float)x / y;  // float /float -> output float 
    System.out.println(result);

    //implicit conversion
    //explicit conversion 

    float f= 100;

    //int i= 100.00;

    //  -  

    float sum;
    int i;
    sum = 0.0f;

    for (i = 1; i <= 10; i++) {
    	sum = sum + 1 /(float) i;
    	System.out.println("i=" + i);
    	System.out.println("sum=" + sum);
    }


    short x1=14;
    short y1=14;
   // short z1=x1+y1;  -  cannot convert from int to short Like 3 
    double z=4;
    float result1=(float) ((float)x1*y1/z);
    System.out.println(result1);

}

	}


