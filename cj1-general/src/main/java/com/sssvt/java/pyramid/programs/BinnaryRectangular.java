/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class BinnaryRectangular {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int rows = 4, cols = 8 , i, j;
	     
	    System.out.print("Enter rows and columns of rectangle\n");
	    
	     
	    /* Row iterator for loop */
	    for(i = 0; i < rows; i++){
	     /* Column iterator for loop */
	        for(j = 0; j < cols; j++){
	            /* Check if currely position is a boundary position */
	            if(i==0 || i==rows-1 || j==0 || j==cols-1)
	            	System.out.print("0");
	            else
	            	System.out.print("1");
	        }
	        System.out.print("\n");
	    }
	    return ;

	}

}
