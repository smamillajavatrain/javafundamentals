/**
 * 
 */
package com.sssvt.general.fundamentals;

/**
 * @author smamilla
 *
 */
public class Demo { // Demo is an identifier which refers class name

	/**
	 * @param args
	 */
	public static void main(String[] args) { // main is an identifier which refers method name
		int a = 10; // int, a, 10, =
		System.out.println(++a);  //a = 11  // pre increment
		// pre increment first increment the value of a and dispaly the value of a
		System.out.println(a++);  // 12  it's wrong ans will be 11
		// Post increment first dispaly the value of a then increment the value of a
		// Post increment
		System.out.println(a);  // 12
	}
}