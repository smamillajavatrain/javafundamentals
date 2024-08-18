/*
		 43.	W A P FOR display the following triangle?
		       *          
		       *   *	
		       *   *   *
		       *   *   *   *
		       *   *   *   *   *         
		       *   *   *   *
		       *   *   *
		       *   *   
		       *

		 */
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class OutputStarsUpAnddownTraingles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		stars(6);
	}

	public static void stars(int n) {

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");

			}
			System.out.println("   ");
		}
		for (int i = 1; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" * ");

			}
			System.out.println("   ");
		}

	}

}
/*
 * output:
 * 
 * * * * * * * * * * * * * * * * *
 * 
 * 
 * 
 */