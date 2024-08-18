/**
 * 
 */
package com.sssvt.general.fundamentals;

/**
 * @author smamilla
 *
 */
public class LargestOfThreeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 121, b = 41, c = 31;
		if (a > b && a > c ) {
			System.out.println("a is greater than b and c");
		} else if(b>c){
			System.out.println("b is greater than a and c");
		}else {
			System.out.println("C is greater than a and b");
		}
	}
}
//  