package com.sac.interviewQuestions;

import java.util.Arrays;
import java.util.List;

/*Given a List of integers (List<Integer>), 
write code in Java 8 style to get the sum of the squares of all the odd numbers in the array.*/
public class SumOfSqauresOfOddNosUsingJava8 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum=list.stream().filter(i->i%2!=0).map(i->i*i).reduce((a,b)->(a+b)).get();
		System.out.println(sum);
	}

}
