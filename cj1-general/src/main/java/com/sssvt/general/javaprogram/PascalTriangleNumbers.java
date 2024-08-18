		//61.	W A P FOR for PASCAL TRIAANGLE?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class PascalTriangleNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		pascal(5);
	}

	public static void pascal(int n) {

		for (int i = 1; i < n; i++) {

			for (int j = 1; j <= (40 - (4 * i / 2)); j++)
				System.out.print("  ");
			for (int k = i; k >= 1; k--)
				System.out.print("    " + i + "   ");

			System.out.println("\n");
		}
	}
}
		/*
		output:
		                                                                                1   

		                                                                            2       2   

		                                                                        3       3       3   

		                                                                    4       4       4       4  
		                                                                                


		*/