/**
 * 
 */
package com.sssvt.conditionalstatements;

/**
 * @author smamilla
 *
 */
public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Reverse of a given numberis "+reverse(345));

	}

	public
	static int reverse(int num) {
		int sum=0;
		while(num!=0) {
			int Digit=num%10;
			sum=sum*10+Digit;
			num/=10;
		}	
		return sum;
		
	}
public static int obtainDigit(int num) {
	while (num!=0) {
		int digit=num%10;
		return digit;
	}	
	return 0;
	
}
}
