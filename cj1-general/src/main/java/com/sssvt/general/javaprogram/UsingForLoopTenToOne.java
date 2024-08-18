//55.WAP for loop display 10 to 1 numbers
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class UsingForLoopTenToOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 10;
		numbers(n);

	}

	public static void numbers(int n) {

		for (int i = n; i >= 1; i--) {
			System.out.println(i);
		}

	}
}
