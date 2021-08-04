package com.practice.sac;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLenghtLambda myLamda = (String s) -> s.length();
		/*
		 * since the type is already present in the getLength method we can
		 * remove the type from lambda expression and if there is only one
		 * argument we can remove the Parenthesis as well
		 */
		StringLenghtLambda myLamda1 = (s) -> s.length(); // or
		StringLenghtLambda myLamda2 = s -> s.length();

		System.out.println(myLamda.getLength("Sachin"));
		System.out.println(myLamda1.getLength("Sachin Chourasiya"));
		System.out.println(myLamda2.getLength("Sachin chourasiya29"));
		
		//printLamda(s -> s.length());

	}

	/*We can also create and method and call that method and pass the lambda directly into the method
	 * line no. 19, this is how type inference works*/
	public static void printLamda(StringLenghtLambda l){
		System.out.println(l.getLength("Hello Lambda"));
	}
	interface StringLenghtLambda {
		int getLength(String s);
	}
}
