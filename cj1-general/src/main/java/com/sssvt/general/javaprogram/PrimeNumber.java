//14.	W A P FOR given number is prime or not?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		prime(21);
	}

	public static void prime(int n) {

		int i;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				break;
			}
			System.out.println(n + "  is not prime number");
		}
		if (i == n) {
			System.out.println(n + " is prime number");
		}

	}

}
/*
 * output; 21 is not prime number
 * 
 */
