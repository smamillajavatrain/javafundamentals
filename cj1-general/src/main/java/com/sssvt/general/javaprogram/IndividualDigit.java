/**
		 * This class Prints Individual Digit of the Given Number 587 Example for
		 * Individual Digit Number for 587 5 8 7 this type of numbers are called
		 * "Individual Digit Numbers".
		 * 
		 */
package com.sssvt.general.javaprogram;

import java.util.ArrayList;

/**
 * @author smamilla
 *
 */
public class IndividualDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 individualDigits(1001);
	}

	@SuppressWarnings("rawtypes")
	public static ArrayList individualDigits(long n) {
		long d = 0;
		ArrayList<Long> al = new ArrayList<Long>();
		while (n != 0) {
			d = n % 10;
			al.add(d);
			n = n / 10;
		}
		return al;
	}

}
