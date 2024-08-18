//23.	W A P FOR shortest of 2 numbers?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SmallestNumberInTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		smallTwo(5, 8);
	}

	public static void smallTwo(int a, int b) {
		System.out.println("the numbers are a=" + a + " b= " + b);
		if (a < b) {
			System.out.println("a is small :" + a);
		} else {
			System.out.println(" b is small :" + b);
		}

	}

}
/*
 * output: the numbers are a=5 b= 8 a is small :5
 * 
 */
