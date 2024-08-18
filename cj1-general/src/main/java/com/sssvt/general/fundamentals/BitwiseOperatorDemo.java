/**
 * 
 */
package com.sssvt.general.fundamentals;

/**
 * @author smamilla
 *
 */
public class BitwiseOperatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 12, b =7;
		System.out.println("Bitwise AND operator result --> "+(a&b));
		System.out.println("Bitwise OR operator result --> "+(a|b));
		System.out.println("Bitwise XOR operator result --> "+(a^b));
		
		System.out.println("Bitwise left shift operator with 2 result --> "+(a<<2));
		System.out.println("Bitwise Right operator operator with 2 result --> "+(a>>2));
	}

}
