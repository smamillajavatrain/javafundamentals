//16.Reverse of given number.
//ex.531= 135
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		reverse(531);
	}

	public static void reverse(int n) {
		int reminder;
		int rev = 0;
		System.out.println("number is : " + n);
		while (n > 0) {
			reminder = n % 10;
			rev = rev * 10 + reminder;
			n = n / 10;
		}
		System.out.println("reverse of a number  is :" + rev);
	}
}
/*
 * output: number is :531 reverse of a number is :135
 * 
 * iteration 1: n = 531 rev = 531%10 = 1 rev = 0+1 = 1 n = 53
 * rev = 1 and n = 53
 * iteration 2 n = 53 r = 53%10 3 rev = 1*10+3 = 13 n = 53/10 5
 * 
 * iteration 3 n = 5 r = 5%10 ->5 rev = 13*10+5-->135 n = 5/10 -->0
 *
 */
