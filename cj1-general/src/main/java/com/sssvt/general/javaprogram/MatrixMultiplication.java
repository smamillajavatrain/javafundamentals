/**
 * Matrix Multiplication
 * declare two multidimensional array of type integer. 
 * Program uses two for loops to get number of rows and columns by using the array1.length. 
 * After getting both matrix then multiply to it. Both matrix will be multiplied to each other by using 'for' loop. 
 * So the output will be displayed on the screen command prompt by using the println() method
*/
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class MatrixMultiplication {

	public static void main(String[] args) {
		int array[][] = { { 5, 6, 7 }, { 4, 8, 9 } };
		int array1[][] = { { 6, 4 }, { 5, 7 }, { 1, 1 } };
		int array2[][] = new int[3][3];
		int x = array.length;
		matrix(x, array, array1, array2);
	}

	public static void matrix(int x, int array[][], int array1[][], int array2[][]) {

		System.out.println("Matrix 1 : ");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= x; j++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println();
		}
		int y = array1.length;
		System.out.println("Matrix 2 : ");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < y - 1; j++) {
				System.out.print(" " + array1[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y - 1; j++) {
				for (int k = 0; k < y; k++) {

					array2[i][j] += array[i][k] * array1[k][j];
				}
			}
		}
		System.out.println("Multiply of both matrix : ");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y - 1; j++) {
				System.out.print(" " + array2[i][j]);
			}
			System.out.println();
		}
	}

}
