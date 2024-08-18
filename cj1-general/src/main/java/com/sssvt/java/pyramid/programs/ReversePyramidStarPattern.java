/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class ReversePyramidStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int i, j, rows = 4;
		    System.out.print("Enter the number of rows\n");
		    for (i = 0; i < rows; i++) {
		        /* Printing spaces */
		        for (j = 0; j < i; j++) {
		        	 System.out.print(" ");
		        }
		        /* Printing stars */
		        for (j = 0;j < 2*(rows-i)-1; j++) {
		        	 System.out.print("*");
		        }
		        System.out.print("\n");
		    }
		    return;
	}

}
