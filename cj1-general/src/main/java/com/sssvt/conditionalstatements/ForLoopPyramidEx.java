/**
 * 
 */
package com.sssvt.conditionalstatements;

/**
 * @author smamilla
 *
 */
public class ForLoopPyramidEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		for (int i = 0; i <= 5; i++) {
			
			for (int j = 1; j <i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
