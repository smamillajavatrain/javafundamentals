/**
 * 
 */
package com.sssvt.java.practice.switchcaseprograms;

/**
 * @author smamilla
 *
 */
public class Square {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 12;
//		System.out.println("Square of a given number "+num+" is "+(num*num));
		System.out.println("Square of a given number "+num+" is "+square(num));
		System.out.println("reverse of a given number "+num+" is "+reverse(num));
	}
	
	public static int square(int num) {
		return num*num;
	}
	
	public static int reverse(int num) {
		int reverse = 0;
		while(num!=0) {
			int reminder = num % 10;
			reverse = reverse*10+reminder;
			num = num/10;
		}
		return reverse;
	}

}
