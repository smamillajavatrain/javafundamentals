/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class HutStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int i, j, space, rows = 8, star = 0;
		 
		    /* Printing upper triangle */
		    for (i = 0; i < rows; i++) {
		        if (i < 5) {
		            /* Printing upper triangle */
		            for (space = 1; space < 5 - i; space++) {
		                System.out.print(" ");
		            }
		            /* Printing stars */
		            while (star != (2 * i + 1)) {
		            	System.out.print("*");
		                star++;;
		            }
		            star = 0;
		            /* move to next row */
		            System.out.print("\n");
		        } else {
		            /* Printing bottom walls of huts */
		            for (j = 0; j < 9; j++) {
		                if ((int) (j / 3) == 1)
		                	System.out.print(" ");
		                else
		                	System.out.print("*");
		            }
		            System.out.print("\n");
		        }
		    }
		    return ;

	}

}
