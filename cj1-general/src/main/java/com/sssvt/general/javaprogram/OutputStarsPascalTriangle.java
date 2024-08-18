/*
		42.	W A P FOR display the following triangle?
		                                      *
		                               *              *
		                        *             *                *
		                *            *               *                 *  

		 */
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class OutputStarsPascalTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		pascal(5);
	}

	public static void pascal(int n) {

		for (int i = 1; i < n; i++) {

			for (int j = 1; j <= (40 - (4 * i / 2)); j++)
				System.out.print("  ");
			for (int k = i; k >= 1; k--)
				System.out.print("   *   ");

			System.out.println("\n");
		}

	}

}
/*
 * output:
 * 
 * 
 * *
 * 
 * * *
 * 
 * * * *
 * 
 * 
 */
