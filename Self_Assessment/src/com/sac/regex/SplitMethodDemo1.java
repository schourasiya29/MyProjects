package com.sac.regex;

import java.util.regex.Pattern;

public class SplitMethodDemo1 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\.");// except '.' remaining are tokens
		// Pattern p = Pattern.compile("[.]");//or we can take like this
		// Pattern p = Pattern.compile(".");//no output in case of only . symbol
		String[] s = p.split("www.durgajobs.com");
		for (String s1 : s) {
			System.out.println(s1);
		}
		System.out.println("***************************************");

		/* String class split method */
		String s1 = "durga software solutions";
		String[] s2 = s1.split("\\s");
		for (String s3 : s2) {
			System.out.println(s3);
		}
	}

}
