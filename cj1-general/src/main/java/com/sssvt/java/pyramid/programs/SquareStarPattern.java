/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class SquareStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int side = 6, i, j;
	    System.out.print("Enter side of square\n");
	    /* Row iterator for loop */
	    for(i = 0; i < side; i++){
	     /* Column iterator for loop */
	        for(j = 0; j < side; j++){
	        	 System.out.print("*");
	        }
	        System.out.print("\n");
	    }
	}

}
