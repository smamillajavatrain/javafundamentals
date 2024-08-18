/**
 * 
 */
package com.sssvt.conditionalstatements;

/**
 * @author smamilla
 *
 */
public class Polindram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		poliindram(123);

	}

	private static void poliindram(int num) {
		int orig=num;
		int result=Reverse.reverse(num);
		if(orig==result)
				System.out.println("Given Number is Polindram");
		else System.out.println("Given number is not polindram");
	}

}
