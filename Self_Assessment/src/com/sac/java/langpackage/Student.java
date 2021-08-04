package com.sac.java.langpackage;

/*Equals method demo
*/
public class Student {
	String name;
	int rollNo;

	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	/*public boolean equals(Object obj) {
		try {
			Student s = (Student) obj;
			if (name.equals(s.name) && rollNo == s.rollNo) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
	}*/
	
	/* or we can also write it as */
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (name.equals(s.name) && rollNo == s.rollNo) {
				return true;
			} else {
				return false;
			}
		}
		return false;

	}
	public static void main(String[] args) {
		Student s1 = new Student("durga", 101);
		Student s2 = new Student("ravi", 102);
		Student s3 = new Student("durga", 101);
		Student s4 = s1;
		/*
		 * Here s1 and s3 content is same even then we will get false output as
		 * Object class equals() compares the reference and not content, Hence
		 * for this we will override the equals method in our class
		 */
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		/*
		 * In the below case we may get class cast exception for our equals
		 * method hence we will handle the exception or can use instanceof
		 * operator and provide false output same as in case of object class
		 * equals method
		 */
		System.out.println(s1.equals("durga"));
		/*
		 * In the below case we may get Null pointer exception for our equals
		 * method hence we will handle the exception or can use instanceof
		 * operator and provide false output same as in case of object class
		 * equals method
		 */
		System.out.println(s1.equals(null));
	}

}
