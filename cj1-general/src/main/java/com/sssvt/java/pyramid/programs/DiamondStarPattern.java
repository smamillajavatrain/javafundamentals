/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class DiamondStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, space, rows=7, star=0;
	     
	    /* Printing upper triangle */
	    for(i = 1; i <= rows; i++) {
	        /* Printing spaces */
	        for(space = 1; space <= rows-i; space++) {
	           System.out.print(" ");
	        }
	        /* Printing stars */
	        while(star != (2*i - 1)) {
	        	 System.out.print("*");
	            star++;;
	        }
	        star=0;
	        /* move to next row */
	        System.out.print("\n");
	    }
	    rows--;
	    /* Printing lower triangle */
	    for(i = rows;i >= 1; i--) {
	        /* Printing spaces */
	        for(space = 0; space <= rows-i; space++) {
	        	 System.out.print(" ");
	        }
	        /* Printing stars */
	        star = 0;
	        while(star != (2*i - 1)) {
	        	 System.out.print("*");
	            star++;
	        }
	        System.out.print("\n");
	    }
	 
	    return ;

	}

}
