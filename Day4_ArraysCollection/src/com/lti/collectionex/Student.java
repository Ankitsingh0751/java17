package com.lti.collectionex;

public class Student implements Comparable<Student> {
	
	int stuId;
	String stuName;
	double marks;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(marks);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + stuId;
		result = prime * result + ((stuName == null) ? 0 : stuName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(marks) != Double.doubleToLongBits(other.marks))
			return false;
		if (stuId != other.stuId)
			return false;
		if (stuName == null) {
			if (other.stuName != null)
				return false;
		} else if (!stuName.equals(other.stuName))
			return false;
		return true;
	}
	public Student() {
		super();
	}
	public Student(int stuId, String stuName, double marks) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.marks = marks;
	}
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\n Student [stuId=" + stuId + ", stuName=" + stuName + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(this.stuId>s.stuId) {
			return 1;
		}
		else if(this.stuId==s.stuId){
			return 0;
		}
		else {
			return -1;
		}
	}
	
	

}
