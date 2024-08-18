//55.WAP while loop display 1 to 10 numbers
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class UsingWhileLoopOneToTen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		numbers(n);
	}

	public static void numbers(int n) {
		int i = 1;
		while (i <= n) {
			System.out.println(i);
			i++;
		}

	}
}
