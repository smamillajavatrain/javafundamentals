
//27.	W A P FOR multiplication table of N number series?
//EX: N=4 need to display 1st table, 2nd table, 3rd table, 4th table.

package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class MultiplicationTableForDiffrentNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		mul(10);
	}

	public static void mul(int n) {

		for (int j = 1; j <= n; j++) {

			for (int i = 1; i < 5; i++) {

				int t = j * i;
				System.out.print(+i + "  *  " + j + "  = " + t);
				System.out.print(" \t  ");

			}
			System.out.println("            ");

		}

	}

}
/*
 * output: 1 * 1 = 1 2 * 1 = 2 3 * 1 = 3 4 * 1 = 4 1 * 2 = 2 2 * 2 = 4 3 * 2 = 6
 * 4 * 2 = 8 1 * 3 = 3 2 * 3 = 6 3 * 3 = 9 4 * 3 = 12 1 * 4 = 4 2 * 4 = 8 3 * 4
 * = 12 4 * 4 = 16 1 * 5 = 5 2 * 5 = 10 3 * 5 = 15 4 * 5 = 20 1 * 6 = 6 2 * 6 =
 * 12 3 * 6 = 18 4 * 6 = 24 1 * 7 = 7 2 * 7 = 14 3 * 7 = 21 4 * 7 = 28 1 * 8 = 8
 * 2 * 8 = 16 3 * 8 = 24 4 * 8 = 32 1 * 9 = 9 2 * 9 = 18 3 * 9 = 27 4 * 9 = 36 1
 * * 10 = 10 2 * 10 = 20 3 * 10 = 30 4 * 10 = 40
 * 
 * 
 */