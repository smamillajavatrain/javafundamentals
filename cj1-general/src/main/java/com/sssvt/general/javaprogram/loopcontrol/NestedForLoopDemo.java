/**
 * 
 */
package com.sssvt.general.javaprogram.loopcontrol;

/**
 * @author smamilla
 *
 */
public class NestedForLoopDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 1;i<=2; i++){  // outer loop
		     for(int j =1; j<=2;j++){  //inner loops
		       System.out.println(j);
		     }
		   }
	}
}