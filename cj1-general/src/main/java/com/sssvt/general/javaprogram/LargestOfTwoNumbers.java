//19.	W A P FOR largest of 2 numbers?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class LargestOfTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		bigTwo(5, 8);
	}

	public static void bigTwo(int a, int b) {

		if (a > b) {
			System.out.println("a is big " + a);
		} else {
			System.out.println(" b is big :" + b);
		}

	}

}
/*
 * output: b is big :8
 */
