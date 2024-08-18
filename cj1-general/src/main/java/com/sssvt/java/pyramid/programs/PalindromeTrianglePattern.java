/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class PalindromeTrianglePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int i, j, rows = 8, count=0;
		 
		    System.out.print("Enter the number of rows\n");
		 
		    for (i = 0; i < 2*rows; i=i+2) {
		        for (j = 0; j <= i; j++) {
		        	 System.out.printf("%c", 'A'+count);
		            if(j < i/2)
		                count++;
		            else
		                count--;
		        }
		        count = 0;
		        System.out.print("\n");
		    }
		    return;

	}

}
