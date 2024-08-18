//55.WAP do...while loop display 1 to 10 numbers
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class UsingDoWhileOneToTenNum {

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
			System.out.println(i);
			i++;
		} while (i <= n);

	}
}
