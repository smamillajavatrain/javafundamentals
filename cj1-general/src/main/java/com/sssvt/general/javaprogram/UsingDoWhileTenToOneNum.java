
//55.WAP do...while loop display 10 to 1 numbers
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class UsingDoWhileTenToOneNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 10;
		numbers(n);

	}

	public static void numbers(int n) {
		int i = 1;
		do {
			System.out.println(n);
			n--;
		} while (i <= n);

	}
}
