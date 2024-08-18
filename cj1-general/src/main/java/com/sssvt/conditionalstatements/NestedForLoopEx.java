/**
 * 
 */
package com.sssvt.conditionalstatements;

/**
 * @author smamilla
 *
 */
public class NestedForLoopEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
