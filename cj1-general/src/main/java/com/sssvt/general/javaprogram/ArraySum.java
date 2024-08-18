//4.	W A P FOR Sum of Array elements?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class ArraySum {
	public static void main(String[] args) {
		arraySum();
	}

	public static void arraySum() {
		int a[] = { 10, 20, 30 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		System.out.println("sum of array elements " + sum);
	}
}
/*
 * output: sum of array elements 60
 */


