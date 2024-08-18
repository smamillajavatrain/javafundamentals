/*41.	W A P FOR display the following triangle?
       *    *    *   *   *          
       *    *    *   *
       *    *    *
       *    *         
       *                                 */
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class OutputStarDownTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		number(6);

	}

	public static void number(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" * ");

			}
			System.out.println("   ");
		}

	}

}
/*
 * output: * * * * * * * * * *
 * 
 * 
 * 
 */