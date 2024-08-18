/**
 * 
 */
package com.sssvt.java.practice.switchcaseprograms;

/**
 * @author smamilla
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// input  num = 98765;        787   787  12  21
		// output should be 56789     187
		int num = 781, reverse = 0;
		while(num!=0) {
			int reminder = num % 10;
			reverse = reverse*10+reminder;
			num = num/10;
		}
		System.out.println("The reverse of a given number is "+reverse);
	}
}
// Polindram Number
// individual digits of a given number