package com.sac.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

/*Write a program to represent a java number in Italy specific form*/
public class NumberFormatDemo {

	public static void main(String[] args) {
		double d = 123456.789;

		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		String s = nf.format(d);
		System.out.println("Italy specific form: " + s);
	}

}
