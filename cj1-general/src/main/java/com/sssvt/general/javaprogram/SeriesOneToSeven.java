//37.	W A P FOR prints the numbers series from 1 to 7 and 0 to 7? o/p: 1,2,3,4,5,6,7 ::: 0,1,2,3,4,5,6,7.
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SeriesOneToSeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		series(8);
	}

	public static void series(int n) {
		for (int i = 1; i < n; i++) {
			System.out.print(i);
			if (i < 7) {
				System.out.print(" , ");
			}
		}
		System.out.print(" ::: ");
		for (int i = 0; i < 8; i++) {
			if (i == 7) {
				System.out.print(i + " . ");
			} else {
				System.out.print(i + " , ");
			}

		}

	}

}
/*
 * output: 1 , 2 , 3 , 4 , 5 , 6 , 7 ::: 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 .
 */
