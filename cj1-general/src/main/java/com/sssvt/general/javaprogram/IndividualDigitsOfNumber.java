//17.	W A P FOR individual digits of a given numbers are 427? O/p: 4,2,7.
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class IndividualDigitsOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		digits(252);
	}

	public static void digits(int n1) {
		int r;
		int rev = 0;
		while (n1 > 0) {
			r = n1 % 10;
			rev = rev * 10 + r;
			n1 = n1 / 10;
		}
		while (rev > 0) {
			int t = rev % 10;
			rev = rev / 10;
			System.out.print(t);
			if (rev != 0) {
				System.out.print(",");
			}

		}
	}

}

/*
 * output: 2,5,2
 */
