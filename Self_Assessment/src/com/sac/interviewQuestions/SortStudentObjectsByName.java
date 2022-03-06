package com.sac.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private String sname;
	private int rollno;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", rollno=" + rollno + "]";
	}

	public Student(String sname, int rollno) {
		super();
		this.sname = sname;
		this.rollno = rollno;
	}

}

public class SortStudentObjectsByName {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Sachin", 1), new Student("Vipin", 2), new Student("Yashi", 3),
				new Student("Abhi", 4));
		System.out.println(list);

		// Example-1
		List<Student> sortedlist = list.stream().sorted((e1, e2) -> (e1.getSname().compareTo(e2.getSname())))
				.collect(Collectors.toList());
		System.out.println(sortedlist);

	}

}
