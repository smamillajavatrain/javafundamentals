/**
 * 
 */
package com.sssvt.general.javaprogram;

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
		System.out.println("Bitwise and (&) operator "+(a&b));
		System.out.println("Bitwise or (|) operator "+(a|b));
		System.out.println("Bitwise xor (&) operator "+(a^b));
		System.out.println("Bitwise left shift (<<) operator "+(a<<3));
		System.out.println("Bitwise right shift (>>) operator "+(a>>3));
	}

}
