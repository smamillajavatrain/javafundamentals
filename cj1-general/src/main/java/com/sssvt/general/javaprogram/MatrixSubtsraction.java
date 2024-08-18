//76.	W A P FOR matrix subtraction?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class MatrixSubtsraction {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		int a[][] = { { 1, 4, 5 }, { 3, 6, 8 } };
		int b[][] = { { 2, 1, 6 }, { 7, 2, 1 } };

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

		System.out.println("  subtraction of A,B matrix");

		for (i = 0; i < n2; i++) {
			for (j = 0; j <= n2; j++) {

				System.out.print("  " + (a[i][j] - b[i][j]));
			}

			System.out.println(" ");
		}

	}

}
/*
 * output:
 * 
 * A matrix 1 4 5 3 6 8 B matrix 2 4 6 7 2 1 Subtraction of A,B matrix -1 0 -1
 * -4 4 7
 * 
 */