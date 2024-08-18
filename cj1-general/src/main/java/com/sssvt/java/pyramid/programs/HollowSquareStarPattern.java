/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class HollowSquareStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int side = 4, i, j;

		System.out.print("Enter side of square\n");
		/* Row iterator for loop */
		for (i = 0; i < side; i++) {
			/* Column iterator for loop */
			for (j = 0; j < side; j++) {
				/* Check if currely position is a boundary position */
				if (i == 0 || i == side - 1 || j == 0 || j == side - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		return;
	}

}
