
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SeriesOneToSixAndReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		series(8);
	}

	public static void series(int n) {
		for (int i = 1; i < n; i++) {
			System.out.print(i + " , ");
		}

		for (int j = 6; j > 0; j--) {
			if (j == 1) {
				System.out.print(j + " . ");
			} else {
				System.out.print(j + " , ");
			}
		}
	}
}

/*
 * output: 1 , 2 , 3 , 4 , 5 , 6 , 7 , 6 , 5 , 4 , 3 , 2 , 1 .
 * 
 */
