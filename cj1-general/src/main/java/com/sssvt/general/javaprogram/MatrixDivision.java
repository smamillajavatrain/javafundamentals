
/*77.	W A P FOR matrix division?
 
				/**
				 * Matrix Division
				 * 	The java two dimensional array program is operate the two matrix. 
				 * Now we are going to use two matrix for dividing the two element.
				 *  We are going to make a integer value for two matrix. 
				 *  After getting the both matrix with us we need to divided both matrix. 
				 *  This program using the two for loop. 
				 *  So the output will be displayed by using "System.out.print(" "+(array[i][j]/array1[i][j]))".
				 */

package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class MatrixDivision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[][] = { { 3, 4, 6 }, { 2, 4, 3 } };
		int array1[][] = { { 3, 2, 3 }, { 4, 2, 3 } };
		int l = array.length;
		matrix(l, array, array1);
	}

	public static void matrix(int l, int array[][], int array1[][]) {
		System.out.println("First matrix is:" + " ");
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println();
		}
		int m = array1.length;
		System.out.println("Second matrix is:" + " ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + array1[i][j]);
			}
			System.out.println();
		}
		System.out.println("Divide of both matrix : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j <= m; j++) {
				System.out.print(" " + (array[i][j] / array1[i][j]));
			}
			System.out.println(" ");
		}
	}

}
/*
 * output: First matrix is: 3 4 6 2 4 3 Second matrix is: 3 2 3 4 2 3 Divide of
 * both matrix : 1 2 2 0 2 1
 * 
 * 
 * 
 */