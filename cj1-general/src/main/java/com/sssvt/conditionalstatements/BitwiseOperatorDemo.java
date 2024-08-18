/**
 * 
 */
package com.sssvt.conditionalstatements;

/**
 * @author smamilla
 *
 */
public class BitwiseOperatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = 6, b = 2;
		System.out.println("bitwise and output is  "+(a&b));
		System.out.println("bitwise or output is  "+(a|b));
		System.out.println("bitwise XOR output is  "+(a^b));
		System.out.println("bitwise left shift a<<3  output is  "+(a<<3));
		System.out.println("bitwise right shift a>>3 output is  "+(a>>3));
	}

}
