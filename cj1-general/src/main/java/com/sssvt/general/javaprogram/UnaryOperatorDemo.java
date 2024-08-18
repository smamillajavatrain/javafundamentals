/**
 * 
 */
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class UnaryOperatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// if we perform any operation on a single operand is called unary operator
		int a = 10;
		// in case of pre increment 1. increment 2. perform action
		//++a or a++  --> a = a +1
		System.out.println(++a); // 11
		System.out.println(a++); // 11  and a = 12
		System.out.println(a--); // a = 12 then a = 11
		System.out.println(--a); // 10
	}

}
