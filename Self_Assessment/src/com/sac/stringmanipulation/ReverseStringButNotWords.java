package com.sac.stringmanipulation;

public class ReverseStringButNotWords {

	public static void main(String[] args) {
		String s = "hello how are you";
		// desired output = "you are how hello"

		String arr[] = s.split(" ");
		String newStr = "";
		for (int i = arr.length - 1; i >= 0; i--) {

			newStr = newStr +" "+ arr[i];

		}
		System.out.println(newStr);
	}

}
