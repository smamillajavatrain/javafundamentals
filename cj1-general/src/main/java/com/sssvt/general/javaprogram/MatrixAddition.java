//74.	W A P FOR Matrix addition?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class MatrixAddition {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int a[][] = { { 2, 3, 4 }, { 5, 8, 6 } };
		int b[][] = { { 1, 4, 5 }, { 3, 6, 8 } };

		int n1 = a.length;
		int n2 = b.length;
		matrix(n1, n2, a, b);
	}

	public static void matrix(int n1, int n2, int a[][], int b[][]) {
		int i, j;
		System.out.println(" A matrix ");
		for (i = 0; i < n1; i++) {
			for (j = 0; j <= n1; j++) {

				System.out.print(" " + a[i][j]);
			}

			System.out.println(" ");
		}

		System.out.println("  B matrix");
		for (i = 0; i < n2; i++) {
			for (j = 0; j <= n2; j++) {
				System.out.print(" " + b[i][j]);
			}
			System.out.println(" ");
		}

		System.out.println("  addition of A,B matrix");

		for (i = 0; i < n2; i++) {
			for (j = 0; j <= n2; j++) {

				System.out.print("  " + (a[i][j] + b[i][j]));
			}

			System.out.println(" ");
		}
	}

}
/*
 * output: A matrix 2 3 4 5 8 6 B matrix 1 4 5 3 6 8 addition of A,B matrix 3 7
 * 9 8 14 14
 * 
 * 
 */
