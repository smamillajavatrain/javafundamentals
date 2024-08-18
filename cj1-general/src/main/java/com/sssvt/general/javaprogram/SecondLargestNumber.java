//49.	W A P FOR second largest of given numbers?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SecondLargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		secondLargest(9, 15, 11);
	}

	public static void secondLargest(int a, int b, int c) {
		System.out.println("the numbers are a=" + a + " b= " + b + " c= " + c);
		if (a > b && a > c) {
			if (b > c) {
				System.out.println("b is second largest :" + b);

			} else {
				System.out.println(" c is second largest :" + c);
			}

		}
		if (b > a && b > c) {
			if (a > c) {
				System.out.println("a is second largest :" + a);

			} else {
				System.out.println(" c is second largest :" + c);
			}

		}
		if (c > b && c > a) {
			if (c > a) {
				System.out.println("c is second largest :" + c);

			} else {
				System.out.println(" a is second largest :" + a);
			}

		}
	}

}
/*
 * output: the numbers are a=9 b= 15 c= 11 c is second largest :11
 * 
 */