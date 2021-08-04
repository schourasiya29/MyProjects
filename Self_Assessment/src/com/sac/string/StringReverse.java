package com.sac.string;

public class StringReverse {

	public static void main(String[] args) {
		String s = "iwantittoeareversestring";
		String res = reverseString(s);
		System.out.println(res + " The length of string is " + res.length());

		// By StringBuilder Class
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}

	public static String reverseString(String str) {
		String out = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			out = out + (str.charAt(i));
		}
		return out;
	}

}
