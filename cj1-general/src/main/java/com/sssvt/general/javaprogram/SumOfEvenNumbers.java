////28.	W A P FOR Sum of even number series? 
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SumOfEvenNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		evenSum(100);
	}

	public static void evenSum(int n) {

		int sum = 0;
		for (int i = 0; i < n; i++) {

			if (i % 2 == 0) {
				sum = sum + i;

			}

		}
		System.out.println("sum of even numbers from 1 to 100 : " + sum);
	}

}
/*
 * output: sum of even numbers from 1 to 100 : 2450
 * 
 */
