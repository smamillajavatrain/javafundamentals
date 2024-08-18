/**
 * 
 */
package com.sssvt.java.practice.switchcaseprograms;

/**
 * @author smamilla
 *
 */
public class SwappingOfTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 12, b = 21;
		int temp = 0;
		System.out.println("Before swapping the values of a as "+a+" and value of b is "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping the values of a as "+a+" and value of b is "+b);
	}

}
