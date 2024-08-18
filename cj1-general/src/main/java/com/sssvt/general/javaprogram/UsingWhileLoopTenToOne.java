//55.WAP while loop display 10 to 1 numbers
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class UsingWhileLoopTenToOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		numbers(n);

	}

	public static void numbers(int n) {
		int i = 1;
		while (n >= i) {
			System.out.println(n);
			n--;
		}

	}
}
