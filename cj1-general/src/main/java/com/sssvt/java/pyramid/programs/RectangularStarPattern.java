/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class RectangularStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int rows = 3, cols=9 , i, j;
//		System.out.print("Enter rows and columns of rectangle\n");
	    /* Row iterator for loop */
	    for(i = 0; i < rows; i++){
	     /* Column iterator for loop */
	        for(j = 0; j < cols; j++){
	        	System.out.print("*");
	        }
	        System.out.print("\n");
	    }
	}

}
