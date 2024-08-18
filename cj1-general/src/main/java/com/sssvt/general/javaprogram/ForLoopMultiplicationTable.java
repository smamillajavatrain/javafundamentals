/**
 * 
 */
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class ForLoopMultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 10;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(i+" *"+j+" ="+(i*j));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}