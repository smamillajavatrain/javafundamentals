//2.	W A P FOR “Armstrong” is or not? 
//EX : 153 =  1 + 125 + 27 = 153
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class Armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		armstrong(153);
	

	}

	/**
	 * 
	 * @param n
	 */
	public static void armstrong(int n) {
		int sum = 0;
		int a = n;
		while (n > 0) {
			int d = n % 10;
			d = d * d * d;
			sum = sum + d;
			n = n / 10;

		}
		if (a == sum) {
			System.out.println(sum + " is a ArmStrong Number");
		}else{
			System.out.println(sum + " is not a ArmStrong Number");
		}
	}
}
/*
 * output: number 153 is armstrong
 */

