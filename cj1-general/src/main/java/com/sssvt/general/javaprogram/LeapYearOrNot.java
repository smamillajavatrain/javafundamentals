//71.	W A P FOR given year is leap year or not?
/*The specific rules for determining leap years are:
 *
 *     1) If a year is divisible by 4 it is a
 *        leap year if #2 does not apply.
 *     2) If a year is divisible by 100 it is 
 *        not a leap year unless #3 applies.
 *     3) If a year is divisible by 400 it is
 *        a leap year.*/

/*Definition of leap year :


 Rule 1 : A year is called leap year if it is divisible by 400. 
 		  For example : 1600,2000  etc leap year while 1500,1700 are not leap year.
 Rule 2 : If year is not divisible by 400 as well as 100 but it is divisible by 4 then 
 		  that year are also leap year. 
 For example:  2004,2008,1012 are leap year.


 Algorithm of leap year :


 IF year MODULER 400 IS 0
 THEN leap_year
 ELSE IF year MODULER 100 IS 0
 THEN not_leap_year
 ELSE IF year MODULER 4 IS 0
 THEN leap_year
 ELSE
 not_leap_year*/

package com.sssvt.general.javaprogram;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;

/**
 * @author smamilla
 *
 */

public class LeapYearOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		leapYear(2030);
		leapYear1();
	}

	public static void leapYear(int n) {
		for (long year = 1900; year <= n; year++) {
			if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
				System.out.println(year + "  is leap year");
			} else {
				System.out.println(year + " is not leap year");

			}
		}
	}

	public static void leapYear1() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter year to check for leap year : ");
		int year;
		try {
			year = Integer.parseInt(in.readLine());
			if (year < 1900 || year > 2100) {
				System.out.print("Please enter a year less than 2101 and greater than 1899.");
				System.exit(0);
			}
			GregorianCalendar cal = new GregorianCalendar();
			if (cal.isLeapYear(year))
				System.out.print("Given year is leap year.");
			else
				System.out.print("Given year is not leap year.");
		} catch (NumberFormatException ne) {
			System.out.print(ne.getMessage() + " is not a legal entry.");
			System.out.println("Please enter a 4-digit number.");
			System.exit(0);
		}

	}
}
/*
 * output: 2020 is leap year
 */