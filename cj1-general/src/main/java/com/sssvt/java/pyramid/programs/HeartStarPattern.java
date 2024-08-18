/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class HeartStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int i,j, rows = 8;
	     
		    System.out.print("Enter the number of rows\n");
		   
		    /* printing top semi circular shapes of heart */
		    for(i = rows/2; i <= rows; i+=2){ 
		     /* Printing Spaces */
		        for(j = 1; j < rows-i; j+=2) {  
		        	System.out.print(" ");  
		        }
		        /* printing stars for left semi circle */
		        for(j = 1; j <= i; j++){  
		        	System.out.print("*");  
		        }  
		        /* Printing Spaces */
		        for(j = 1; j <= rows-i; j++){  
		        	System.out.print(" ");  
		        }  
		        /* printing stars for right semi circle */
		        for(j = 1; j <= i; j++){  
		        	System.out.print("*");  
		        }  
		        /* move to next row */
		        System.out.print("\n");  
		    }  
		     
		    /* printing inverted start pyramid */
		    for(i = rows; i >= 1; i--){  
		        for(j = i; j < rows; j++){  
		        	System.out.print(" ");  
		        }  
		        for(j = 1; j <= (i*2)-1; j++){  
		        	System.out.print("*");  
		        }  
		        /* move to next row */
		        System.out.print("\n");  
		    }  
		   
		    return ;  

	}

}
