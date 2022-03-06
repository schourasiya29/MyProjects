package com.sac.stringmanipulation;

public class StringPalindromeDemo {

	public static void main(String[] args) {
		String str = "abcba";
		boolean ispalindrome =isPalindrome(str);
		System.out.println(ispalindrome);
	}

	public static boolean isPalindrome(String str) {
		String original = str;
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (original.equals(reverse))
			return true;
		else
			return false;
	}
}
