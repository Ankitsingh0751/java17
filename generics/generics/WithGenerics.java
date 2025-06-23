package com.lti.demos7.generics;

import java.util.ArrayList;
import java.util.List;

public class WithGenerics {

    static void printNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i); 
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        
      // names.add(new StringBuilder("Webby")); // DOES NOT COMPILE
        names.add(new String("Webby"));
        printNames(names);
    }
}
// Generics wildcard  ? 
// bounded generics // bounded wildcards 