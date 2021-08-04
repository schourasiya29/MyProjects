package com.sac.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailIdValidationRegExDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Scanner sc = new Scanner(System.in);
		String j = sc.next();
		Matcher m = p.matcher(j);
		if (m.find() && m.group().equals(j)) {
			System.out.println("Valid Mail ID");
		} else {
			System.out.println("Invalid Mail ID");
		}
	}

}
