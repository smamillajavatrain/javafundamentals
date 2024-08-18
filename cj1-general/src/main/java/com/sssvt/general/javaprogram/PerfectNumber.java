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
public class PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		perfectNumber(6);
	}

	public static void perfectNumber(int n) {
		int i = 1, sum = 0;
		while (i < n) {
			if (n % i == 0)
				sum = sum + i;
			i++;
		}
		if (sum == n)
			System.out.println("The no " + n + "  is a perfect number ");
		else
			System.out.println("The no " + n + " is not a perfect number ");

	}

}

//output:
//The no 6  is a perfect number 
