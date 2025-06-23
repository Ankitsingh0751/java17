package com.lti.demos;

class GenClass<T> {    
    T ob;    
    GenClass(T obj)
    {
        ob = obj;
    }    
    T getOb()
    {
        return ob;
    }    
    void showType()
    {
        System.out.println("T Type : "+ob.getClass().getName());
    }
}
public class Javaapp {
     public static void main(String[] args) {
     	//Invoking  and Instantiating a Generic Type -- Diamond     	
        GenClass<Integer> iob = new GenClass<Integer>(50);
        iob.showType();
        int getInt = iob.getOb();
        System.out.println("Value  : "+getInt);
        
        GenClass<String> sob = new GenClass<String>("Hello");
        sob.showType();
        String getString = sob.getOb();
        System.out.println("Value  : "+getString);
    }
}