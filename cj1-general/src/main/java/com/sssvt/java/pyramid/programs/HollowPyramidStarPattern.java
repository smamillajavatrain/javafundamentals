/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class HollowPyramidStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, space, rows = 8, star=0;
	   System.out.print("Enter the number of rows\n");
	   
	    /* printing one row in every iteration */
	    for(i = 0; i < rows-1; i++) {
	        /* Printing spaces */
	        for(space = 1; space < rows-i; space++) {
	        	System.out.print(" ");
	        }
	        /* Printing stars */
	        for (star = 0; star <= 2*i; star++) {
	            if(star==0 || star==2*i)
	            	System.out.print("*");
	            else
	            	System.out.print(" ");
	        }
	        /* move to next row */
	        System.out.print("\n");
	    }
	    /* print last row */
	    for(i=0; i<2*rows-1; i++){
	    	System.out.print("*");
	    }
	    return ;

	}

}
