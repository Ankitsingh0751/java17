package com.model;
import javax.persistence.*;


@Entity
@Table(name = "emp")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int eno;
	String ename;
	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
