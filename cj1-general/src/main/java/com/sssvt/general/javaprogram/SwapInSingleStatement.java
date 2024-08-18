//33.	W A P FOR Swapping of 2 numbers with single statement?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SwapInSingleStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		swap(31, 32);
	}

	public static void swap(int a, int b) {
		System.out.println("before swapping");
		System.out.println("a value" + a);
		System.out.println("b value " + b);
		b = a + b - (a = b);
		System.out.println("after swapping");
		System.out.println("a value" + a);
		System.out.println("b value " + b);
	}

}
/*
 * output: before swapping a value31 b value 32 after swapping a value32 b value
 * 31
 * 
 */
