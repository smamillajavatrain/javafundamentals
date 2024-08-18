//24.	W A P FOR shortest of 3 numbers?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SmallestNumberinThreeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		smallThree(9, 15, 8);
	}

	public static void smallThree(int a, int b, int c) {

		System.out.println("the numbers are a=" + a + " b= " + b + " c= " + c);
		if (a < b && a < c) {
			System.out.println("a is small: " + a);
		} else if (b < c) {
			System.out.println("b is small :" + b);

		} else {
			System.out.println(" c is small :" + c);
		}

	}

}
/*
 * output;
 * 
 * the numbers are a=9 b= 15 c= 8 c is small :8
 * 
 */
