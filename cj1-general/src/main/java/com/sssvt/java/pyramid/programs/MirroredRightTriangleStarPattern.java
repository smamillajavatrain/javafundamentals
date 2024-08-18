/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class MirroredRightTriangleStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, j, rows = 8;
		 
		System.out.print("Enter the number of rows\n");
	   
	 
	    for(i = 0; i < rows; i++){
	        /* for j th row, first print rows-r spaces then stars */
	        for(j = 0; j < rows; j++){
	            if(j < rows-i-1){
	            	System.out.print(" ");
	            } else {
	            	System.out.print("*");
	            }
	        }
	        /* move to next row */
	        System.out.print("\n");
	    }
	    return;
	}

}
