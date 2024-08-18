//34.	W A P FOR square of a given number?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SquareOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("number    square      ");
		square(10);
	}

	public static void square(int n) {
		for (int i = 1; i <= n; i++) {
			int s1 = i * i;
			System.out.println(+i + "          " + s1);
		}

	}

}
/*
 * output: number square 1 1 2 4 3 9 4 16
 * 
 * 
 */