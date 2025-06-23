package com.lti.collectionex;

import java.util.Comparator;

public class StuSortByMarks implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getMarks()<s2.getMarks()) {//now in descending order
			return 1;//if here -1 and there 1 then ascending order
		}
		else {
			return -1;	
		}
		
	}

}
