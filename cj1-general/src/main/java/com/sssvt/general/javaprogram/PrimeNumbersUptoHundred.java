//15.	W A P FOR first 100 prime numbers display?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class PrimeNumbersUptoHundred {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("prime numbers");
		for (int j = 1; j <= 100; j++) {
			PrimeNumber.prime(j);
		}
	}
}
/*
 * output: prime numbers 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71
 * 73 79 83 89 97
 * 
 */
