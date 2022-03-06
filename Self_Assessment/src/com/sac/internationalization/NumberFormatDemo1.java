package com.sac.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

/*Write a program to represent a java number in India, UK and US currency forms*/
public class NumberFormatDemo1 {

	public static void main(String[] args) {
		double d = 123456.789;
		Locale india = new Locale("pa", "IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(india);
		System.out.println("India Specific form: "+nf.format(d));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK Specific form: "+nf1.format(d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US Specific form: "+nf2.format(d));
		
		
	}

}
