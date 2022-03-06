package com.sac.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/*Write a program to display the current system date in possible style of US forms*/
public class DateFormatDemo {

	public static void main(String[] args) {

		System.out.println("US FULL Form: "+DateFormat.getDateInstance(0, Locale.US).format(new Date()));
		/*or*/
		DateFormat df = DateFormat.getDateInstance(1, Locale.US);
		System.out.println("US LONG Form: "+df.format(new Date()));
		
		System.out.println("US MEDIUM Form: "+DateFormat.getDateInstance(2, Locale.US).format(new Date()));
		System.out.println("US SHORT Form: "+DateFormat.getDateInstance(3, Locale.US).format(new Date()));
		
		/*Default style id MEDIUM and default locale India*/
		System.out.println("US SHORT Form: "+DateFormat.getDateInstance().format(new Date()));
	}

}
