/**
 * 
 */
package com.sssvt.general.javaprogram.loopcontrol;

/**
 * @author smamilla
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 1;i<=10; i++){  // outer loop  i = 1
		     for(int j =1; j<=10;j++){  //inner loops
		       System.out.print(j+ "* "+i+ " = "+ (i*j));
		       System.out.print("   ");
		     }
		     System.out.println();
		   }
	}

}
