package com.sac.practice;

import java.util.Scanner;

class Student{
	
}
class Employee{
	
}
public class NewInstanceExample {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//Provide fully classified name->com.sac.practice.Student
		Object obj = Class.forName(str).newInstance();
		System.out.println("Object Created for " + obj.getClass().getName());
	}

}