package com.sac.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoValidationRegExDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Scanner sc = new Scanner(System.in);
		String j = sc.next();
		Matcher m = p.matcher(j);
		if (m.find() && m.group().equals(j)) {
			System.out.println("Valid Mobile No.");
		} else {
			System.out.println("Invalid Mobile No.");
		}
	}

}
