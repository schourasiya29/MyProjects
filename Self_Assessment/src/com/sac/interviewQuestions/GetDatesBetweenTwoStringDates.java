package com.sac.interviewQuestions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/*Write a program get dates in range as List of string for following dates
Dates strings :  '2021-01-01' and '2021-01-31' */

public class GetDatesBetweenTwoStringDates {

	public static void main(String[] args) {
		/*
		 * // Java <= 7 Date fromDate = new Date("2021-01-01"); Date toDate =
		 * new Date("2021-01-31"); Calendar cal = Calendar.getInstance();
		 * cal.setTime(fromDate); while (cal.getTime().before(toDate)) {
		 * cal.add(Calendar.DATE, 1); System.out.println(cal.getTime()); }
		 * System.out.println();
		 * 
		 * // Java <= 7 Calendar lastDate = Calendar.getInstance();
		 * lastDate.setTime(toDate); lastDate.add(Calendar.DATE, -1); Calendar
		 * cal2 = Calendar.getInstance(); cal2.setTime(fromDate); while
		 * (cal2.before(lastDate)) { cal2.add(Calendar.DATE, 1);
		 * System.out.println(cal2.getTime()); } System.out.println();
		 */
		// Java 8+
		List<LocalDate> dates = new ArrayList<>();
		LocalDate firstDate = LocalDate.of(2021, 01, 01);
		LocalDate secondDate = LocalDate.of(2021, 01, 31);
		LocalDate current = firstDate;
		// current = current.plusDays(1); // If you don't want to include the
		// start date
		// toDate = toDate.plusDays(1); // If you want to include the end date
		while (current.isBefore(secondDate)) {

			System.out.println(current);
			current = current.plusDays(1);
			dates.add(current);

		}
		// System.out.println(dates);
	}

}
