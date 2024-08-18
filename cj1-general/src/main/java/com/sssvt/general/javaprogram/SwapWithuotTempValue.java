//	//32.	W A P FOR Swapping of 2 numbers without temp?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SwapWithuotTempValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		swap(50, 20);
	}

	public static void swap(int a, int b) {

		System.out.println("before swapping");
		System.out.println("a value " + a);
		System.out.println("b value " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping");

		System.out.println("a value " + a);
		System.out.println("b value " + b);

	}

}
/*
 * output: before swapping a value50 b value 20 after swapping a value20 b value
 * 50
 * 
 */
