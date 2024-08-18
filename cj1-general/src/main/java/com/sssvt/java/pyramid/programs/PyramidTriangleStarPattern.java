/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class PyramidTriangleStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, j, rows = 4, star = 0;
		System.out.print("Enter the number of rows\n");
	    /* printing one row in every iteration */
	    for (i = 0; i < rows; i++) {
	        /* Printing spaces */
	        for (j = 0; j <= (rows - i - 1); j++) {
	        	System.out.print(" ");
	        }
	        /* Printing stars */
	        while (star != (2 * i + 1)) {
	        	System.out.print("*");
	            star++;;
	        }
	        star = 0;
	        /* move to next row */
	        System.out.print("\n");
	    }
	    return;

	}

}
