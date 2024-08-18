//18.	W A P FOR individual digits of a sum of given numbers are 587? O/p: 5+8+7=20.
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class IndividualdigitsSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		digitSum(531);
	}

	public static void digitSum(int n) {
		int r;
		int sum = 0;
		System.out.println("the number: " + n);
		while (n > 0) {
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println("sum of the number : " + sum);

	}

}
/*
 * output: the number: 531 sum of the number : 9
 * 
 * 
 */
