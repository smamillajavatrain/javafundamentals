/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class ReversedMirroredRightTriangleStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, j, rows = 6;

		System.out.print("Enter the number of rows\n");

		for (i = 0; i < rows; i++) {
			for (j = 0; j < rows; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
		return;

	}

}
