
/**
		 * Perfect number is a positive number which sum of all positive divisors excluding that number is equal to that number. 
		 * For example 6 is perfect number since divisor of 6 are 1, 2 and 3.  Sum of its divisor is
				1 + 2+ 3 =6
				Note: 6 is the smallest perfect number. 
			Next perfect number is 28 since 1+ 2 + 4 + 7 + 14 = 28
			Some more perfect numbers: 496, 8128
		 */

package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class PerfectNumberList {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			PerfectNumber.perfectNumber(i);
		}

	}

}
