/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class MultiplicationTables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, j, rows = 10;
		   int count = 1;
		    
		   System.out.print("Enter the number of rows\n");
		   
		     
		   for (i = 0; i < rows; i++) {
		      for (j = 0; j <= i; j++) {
		    	  System.out.printf("%d ", i*j);
		      }
		      System.out.print("\n");
		   }
		   return;

	}

}
