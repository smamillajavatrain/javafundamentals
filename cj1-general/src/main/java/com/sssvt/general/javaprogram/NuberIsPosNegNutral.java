//56.	 W A P FOR find out a given number is positive, negative or neutral?
package com.sssvt.general.javaprogram;

import java.io.*;

/**
 * @author smamilla
 *
 */
public class NuberIsPosNegNutral {

	/**
	 * @param args
	 */

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter n value");
		int n = Integer.parseInt(br.readLine());
		number(n);
	}

	public static void number(int n) {
		if (n > 0) {
			System.out.println(n + " is positive");
		} else if (n < 0) {
			System.out.println(n + " is negative");

		} else {
			System.out.println(n + " is neutral");
		}

	}

}
/*
 * output: enter n value 6 6 is positive
 * 
 */