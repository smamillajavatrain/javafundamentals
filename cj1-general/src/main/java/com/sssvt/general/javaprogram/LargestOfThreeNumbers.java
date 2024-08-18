//20.	W A P FOR largest of 3 numbers?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class LargestOfThreeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		bigThree(9, 15, 8);
	}

	public static void bigThree(int a, int b, int c) {

		if (a > b && a > c) {
			System.out.println("a is big: " + a);
		} else if (b > c) {
			System.out.println("b is big :" + b);

		} else {
			System.out.println(" c is big :" + c);
		}

	}

}
/*
 * output: b is big :15
 * 
 */
