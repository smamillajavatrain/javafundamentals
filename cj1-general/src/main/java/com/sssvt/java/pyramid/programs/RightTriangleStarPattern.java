/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class RightTriangleStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int rows = 7, cols=7 , i, j;
		  System.out.print("Enter the number of rows\n");
		   for(i = 0; i < rows; i++) {
		        /* Prints one row of triangle */
		        for(j = 0; j <= i; ++j) {
		        	System.out.print("* ");
		        }
		        /* move to next row */
		        System.out.print("\n");
		    }
		    return;
	}

}
