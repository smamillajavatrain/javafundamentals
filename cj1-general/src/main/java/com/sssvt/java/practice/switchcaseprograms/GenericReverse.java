/**
 * 
 */
package com.sssvt.java.practice.switchcaseprograms;

/**
 * @author smamilla
 *
 */
public class GenericReverse {

	public static int reverse(int num) { 
			int sum = 0;
			double d = 6.3d;
			while (num != 0) {
				int Digit = num % 10;
				sum = sum * 10 + Digit;
				num /= 10;
			}
			return sum;
		}
}