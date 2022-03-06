package com.sac.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/*Write a program to display the current system date in US,UK and Italy style */
public class DateFormatDemo2 {

	public static void main(String[] args) {

		DateFormat us = DateFormat.getDateInstance(0, Locale.US);
		DateFormat uk = DateFormat.getDateInstance(0, Locale.UK);
		DateFormat italy = DateFormat.getDateInstance(0, Locale.ITALY);

		System.out.println("US Form: " + us.format(new Date()));
		System.out.println("UK Form: " + uk.format(new Date()));
		System.out.println("Italy Form: " + italy.format(new Date()));
	}

}
