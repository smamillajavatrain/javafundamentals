/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class ExponentiallyIncreaseStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j,rows = 4;
		System.out.print("Enter the number of rows\n");
	    
	     
	    for(i = 0; i < rows; i++){
	     /* Prints one row of pattern */
	       for(j = 0; j < pow(2,i); j++){
	    	   System.out.print("*");
	       }
	       /* move to next row */
	       System.out.print("\n");
	    }
	    return;

	}

	private static int pow(int i, int i2) {
		
		return 0;
	}

}
