/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class BinaryNumberTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, j, rows=5;
	    int count = 1;
	    for (i = 0; i < rows; i++) {
	        for (j = 0; j <= i; j++) {
	        	System.out.print(count);
	        	count++;
	        	if(count>1) {
	        		count = 0;
	        	}
	        }
	        count = i % 2;
	        System.out.print("\n");
	    }
	}
}