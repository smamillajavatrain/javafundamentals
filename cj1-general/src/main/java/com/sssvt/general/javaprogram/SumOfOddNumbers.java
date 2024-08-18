//29.	W A P FOR sum of odd number series?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SumOfOddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		oddSum(100);
	}

	public static void oddSum(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {

			if (i % 2 != 0) {

				sum = sum + i;
			}

			// System.out.println("sum of even numbers " +sum);
		}
		System.out.println("sum of odd numbers from 1 to 100 : " + sum);

	}

}
/*
 * output: sum of odd numbers from 1 to 100 : 2500
 * 
 * 
 */
