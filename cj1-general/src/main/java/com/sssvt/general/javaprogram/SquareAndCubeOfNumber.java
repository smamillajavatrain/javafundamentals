//34.	W A P FOR square of a given number?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SquareAndCubeOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		square(5);
	}

	public static void square(int n) {
		System.out.println("number    square   cube   ");
		for (int i = 1; i < n; i++) {
			int s1 = i * i;
			int s2 = i * i * i;

			System.out.println(+i + "          " + s1 + "         " + s2);
		}

	}

}
/*
 * output: number square cube 1 1 1 2 4 8 3 9 27 4 16 64
 * 
 * 
 */
