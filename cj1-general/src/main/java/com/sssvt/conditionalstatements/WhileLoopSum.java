/**
 * 
 */
package com.sssvt.conditionalstatements;

/**
 * @author smamilla
 *
 */
public class WhileLoopSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 int sum = 0;
		  int i = 1;
		  while (i < 101) {
		   //System.out.print(i);
		   sum = sum + i;
		   ++i;
		  }
		  System.out.println("SUM OF "+sum);
		}

}
