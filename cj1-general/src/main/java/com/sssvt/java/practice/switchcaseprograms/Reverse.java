/**
 * 
 */
package com.sssvt.java.practice.switchcaseprograms;

/**
 * @author smamilla  document comment
 *
 */
public class Reverse {

	/**
	 * @param args 
	 */
	public static void main(String... args) {
		int num = Integer.valueOf(args[0]);
		System.out.println("Reverse of a given numberis " + reverse(num));  // calling method
		
		// you are sending the actual value from the calling method that's why we called this varaible as actual paramter
	}
	
	// as am ret-type fun-name(arguments)  single line
	public static int reverse(int num) { // called method
		/* from the called method the value as replaced from the calling method
	 that's why we are calling this parameter as formal parameter */ // multi line
		int sum = 0; // local variable and automatically will be expired after execution of reverse method
		while (num != 0) {
			int Digit = num % 10;
			sum = sum * 10 + Digit;
			num /= 10;
		}
		return sum;
	}

	public static int obtainDigit(int num) {
		while (num != 0) {
			int digit = num % 10;
			return digit;
		}
		return 0;
	}
}
