/**
 * 
 */
package com.sssvt.conditionalstatements;

/**
 * @author smamilla
 *
 */
public class BreakStament {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		for (int i = 1; i <= 10; ++i) {
			if (i == 6) {
				;
				break;
			}
			System.out.println(i);
		}

	}
}