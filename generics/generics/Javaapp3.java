package com.lti.demos7.generics;

//Type Inference 
///The compiler figures out the value of the type parameters by examining the types of the constructor arguments. 
//This process is called type inference

/*
 * The most commonly used type parameter names are:

E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
 */


//Multiple Type Parameters 


class GenClass1<T, V> {

    T tob;
    V vob;

    GenClass1(T to, V vo) {
        tob = to;
        vob = vo;
    }

    T getFirstObj() {
        return tob;
    }

    V getSecondObj() {
        return vob;
    }

    void showTypes() {
        System.out.println("T Type : " + tob.getClass().getName());
        System.out.println("V Type : " + vob.getClass().getName());
    }
}
//It works for multiple parameter 
// eg HashMap example 
public class Javaapp3 {

    public static void main(String[] args) {

        GenClass1<Integer, String> gen1 = new GenClass1<Integer, String>(20, "Twenty");
        gen1.showTypes();
        int getInt = gen1.getFirstObj();
        String getStr1 = gen1.getSecondObj();
        System.out.println("Int Value : " + getInt);
        System.out.println("Str Value : " + getStr1);
        
        GenClass1<String, String> gen2 = new GenClass1<String, String>("Twenty", "Forty");
        gen2.showTypes();
        String getStr2 = gen2.getFirstObj();
        String getStr3 = gen2.getSecondObj();
        System.out.println("Str Value : " + getStr2);
        System.out.println("Str Value : " + getStr3);
    }
}