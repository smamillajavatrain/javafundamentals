/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class RhombusStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, j, rows = 7;
		 
	    System.out.print("Enter the number of rows\n");
	    for (i = 0; i < rows; i++) {
	        /* Print spaces before stars in a row */
	        for (j = 0; j < i; j++) {
	        	System.out.print(" ");
	        }
	        /* Print rows stars after spaces in a row */
	        for (j = 0; j < rows; j++) {
	        	System.out.print("*");
	        }
	        /* jump to next row */
	        System.out.print("\n");
	    }
	    return ;
	}

}
