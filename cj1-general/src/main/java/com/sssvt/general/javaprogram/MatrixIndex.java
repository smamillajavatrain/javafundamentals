//78.	W A P FOR find out the index of matrix if we give elements in a matrix?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class MatrixIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[][] = { { 1, 4, 5 }, { 3, 6, 8 } };

		int n1 = a.length;
		matrix(n1, a);
	}

	public static void matrix(int n1, int a[][]) {
		int i, j;
		System.out.println(" A matrix ");
		for (i = 0; i < n1; i++) {
			for (j = 0; j <= n1; j++) {

				System.out.print(" " + a[i][j]);
			}

			System.out.println(" ");
		}

		System.out.println("  index of 6 element is: ");
		for (i = 0; i < n1; i++) {
			for (j = 0; j <= n1; j++) {
				if (a[i][j] == 6) {
					System.out.print(j + " " + i);
				}
			}
			System.out.println(" ");
		}
	}

}
/*
 * 
 * output: A matrix 1 4 5 3 6 8 index of 6 element is:
 * 
 * 1 1
 * 
 * 
 * 
 */