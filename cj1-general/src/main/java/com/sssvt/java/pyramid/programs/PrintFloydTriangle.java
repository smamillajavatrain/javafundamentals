package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class PrintFloydTriangle {

	public static void main(String[] args) {
		int rows = 4, number = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				++number;
			}
			System.out.println();
		}
	}
}
