//45.	W A P FOR palindrome of a given number?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class PolyndromNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		poly(531);
	}

	public static void poly(int n) {

		int r, t = n;
		int rev = 0;
		System.out.println("the number is :" + n);
		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		System.out.println("reverse of a number  " + rev);
		if (t == rev) {
			System.out.println(t + " is polyndrom");
		} else {

			System.out.println(t + " is  not polyndrom");
		}
	}
}
/*
 * output: the number is :531 reverse of a number 135 531 is not polyndrom
 * 
 */