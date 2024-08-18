//21.	W A P FOR largest of 4 numbers?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class LargestOfFourthNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		bigestFour(9, 15, 8, 30);
	}

	public static void bigestFour(int a, int b, int c, int d) {

		if (a > b && a > c && a > d) {
			System.out.println("a is big: " + a);
		} else if (b > a && b > c && b > d) {
			System.out.println("b is big :" + b);

		} else if (c > d) {
			System.out.println(" c is big :" + c);

		} else {
			System.out.println(" d is big :" + d);
		}

	}

}
/*
 * output: d is big :30
 */
