//26.	W A P FOR multiplication table of a given number?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		mulTable(16);
	}

	public static void mulTable(int m) {

		for (int i = 1; i <= 10; i++) {
			int t = m * i;

			System.out.print(+m + "  *  " + i + "  = " + t);
			System.out.println("   ");

		}

	}

}
/*
 * output: 5 * 1 = 5 5 * 2 = 10 5 * 3 = 15 5 * 4 = 20 5 * 5 = 25 5 * 6 = 30 5 *
 * 7 = 35 5 * 8 = 40 5 * 9 = 45 5 * 10 = 50
 * 
 * 
 */
