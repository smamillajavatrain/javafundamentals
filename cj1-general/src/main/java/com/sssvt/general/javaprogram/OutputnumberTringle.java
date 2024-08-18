
/*39.	W A P FOR displays the following triangle?
       1          
       2   3
       4   5   6
       7   8   9   10 */
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class OutputnumberTringle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		triangle(5);
	}

	public static void triangle(int n) {
		int k = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  " + k);
				k++;
			}
			System.out.println("   ");
		}

	}

}
/*
 * output: 1 2 3 4 5 6 7 8 9 10
 * 
 */