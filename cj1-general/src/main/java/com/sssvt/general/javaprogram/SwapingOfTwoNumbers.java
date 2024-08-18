//31.	W A P FOR Swapping of 2 numbers?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SwapingOfTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		swapTwo(10, 20);
	}

	public static void swapTwo(int a, int b) {
		// a = 10  b = 20
		int temp;
		System.out.println("before swapping");
		System.out.println("a value " + a);
		System.out.println("b value " + b);
		System.out.println(" ");

		temp = a; // temp = 10
		a = b;   // a = 20
		b = temp; // b = 10;
		System.out.println("after swapping");

		System.out.println("a value " + a);
		System.out.println("b value " + b);

	}

}
/*
 * output: before swapping a value10 b value 20 after swapping a value20 b value
 * 10
 * 
 */