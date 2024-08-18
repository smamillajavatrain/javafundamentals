//25.	W A P FOR shortest of 4 numbers?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SmallestNumberInFourNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		smallFour(9, 15, 8, 30);
	}

	public static void smallFour(int a, int b, int c, int d) {
		System.out.println("the numbers are a=" + a + " b= " + b + " c= " + c + " " + d);
		if (a < b && a < c && a < d) {
			System.out.println("a is small: " + a);
		} else if (b < a && b < c && b < d) {
			System.out.println("b is small :" + b);

		} else if (c < d) {
			System.out.println(" c is small :" + c);

		} else {
			System.out.println(" d is small :" + d);
		}

	}

}
/*
 * output: the numbers are a=9 b= 15 c= 8 30 c is small :8
 * 
 * 
 */