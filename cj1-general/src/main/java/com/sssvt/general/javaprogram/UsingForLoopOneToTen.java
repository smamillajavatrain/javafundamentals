//55.WAP for loop display 1 to 10 numbers
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class UsingForLoopOneToTen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		numbers(n);

	}

	public static void numbers(int n) {

		/*
		 * for(int i=1;i<=n;i++){ System.out.println(i);
		 * 
		 * }
		 */

		int i = 11;
		/*
		 * for(;i<=10;) { System.out.println(i); i++; }
		 * System.out.println("Cond failing");
		 */
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Cond failing");
		/*
		 * do { System.out.println(i); i++; }while(i<=10);
		 */
	}
}