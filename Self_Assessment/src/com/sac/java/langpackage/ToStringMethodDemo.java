package com.sac.java.langpackage;

public class ToStringMethodDemo {

	String Student_name;
	int Student_RollNo;

	ToStringMethodDemo(String Student_name, int Student_RollNo) {
		this.Student_name = Student_name;
		this.Student_RollNo = Student_RollNo;
	}

	/*
	 * Need to override the toSting() method of Object class in our own class to
	 * print the meaningful information
	 * 
	 */
	public String toString() {
		return "The name of the student is = " + Student_name + " and RollNo is = " + Student_RollNo;
	}

	public static void main(String[] args) {
		ToStringMethodDemo s1 = new ToStringMethodDemo("Sachin", 101);
		ToStringMethodDemo s2 = new ToStringMethodDemo("Sonu", 102);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);

	}

}
