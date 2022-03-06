package com.sac.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormatDemo {

	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateTimeInstance(0, 0, Locale.US);
		DateFormat df1 = DateFormat.getDateTimeInstance(0, 0, Locale.UK);
		DateFormat df2 = DateFormat.getDateTimeInstance(0, 0, Locale.ITALY);
		System.out.println("US FULL Form Date and Time: " + df.format(new Date()));
		System.out.println("UK FULL Form Date and Time: " + df1.format(new Date()));
		System.out.println("ITALY FULL Form Date and Time: " + df2.format(new Date()));
	}

}
