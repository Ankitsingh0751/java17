package com.lti.collectionex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo2SetEx {

	public static void main(String[] args) {

     Set<Integer> mySet=new HashSet<>();
     
     mySet.add(100);
     mySet.add(200);
     mySet.add(100);
     System.out.println(mySet);
     
     Student s1=new Student(102,"Vijay",80);
     Student s2=new Student(101,"Jay",70);
     Student s3=new Student(103,"SanJay",90);
     
     Set<Student> stuSet=new HashSet<>();
     stuSet.add(s1);
     stuSet.add(s2);
     stuSet.add(s3);
     
     System.out.println(s1.hashCode());
     System.out.println(s2.hashCode());
     System.out.println(s3.hashCode());
     
     System.out.println(stuSet);
     
     System.out.println("-----------TREE SET------------");

     Set<Integer> myTSet=new TreeSet<>();
     
     myTSet.add(100);
     myTSet.add(200);
     myTSet.add(100);
     System.out.println(myTSet);
     

     
 
     
     Set<Student> stuTSet=new TreeSet<>();
     stuTSet.add(s1);
     stuTSet.add(s2);
     stuTSet.add(s3);
     
     System.out.println(s1.hashCode());
     System.out.println(s2.hashCode());
     System.out.println(s3.hashCode());
     
     System.out.println(stuTSet);
     
     
     System.out.println("---------ARRAY LIST SORTING------------");
     
     List<Integer>myList=new ArrayList<>();
     myList.add(500);
     myList.add(400);
     myList.add(100);
     myList.add(300);
     myList.add(200);
     
     Collections.sort(myList);
     System.out.println(myList);
     
     
     
     List<Student>myList2=new ArrayList<>();
     myList2.add(s2);
     myList2.add(s1);
     myList2.add(s3);
     
     
     Collections.sort(myList2);
     System.out.println(myList2);
     
     System.out.println("-----Sort by marks-----");
     
     Collections.sort(myList2, new StuSortByMarks());
     System.out.println(myList2);
     

	}

}
