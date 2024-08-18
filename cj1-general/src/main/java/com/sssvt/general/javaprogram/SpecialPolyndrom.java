
package com.sssvt.general.javaprogram;

import java.io.*;

/**
 * @author smamilla
 *
 */
public class SpecialPolyndrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		System.out.print("Enter any string to convert it into polyndrom string :");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String reversedString, givenString = br.readLine();

		int length = givenString.length();
		char c;

		StringBuffer dest = new StringBuffer(length);
		StringBuffer possibleString = new StringBuffer(length);

		for (int i = length - 1; i >= 0; i--) {
			c = givenString.charAt(i);
			dest.append(c);
		}
		reversedString = dest.toString();
		possibleString.append(givenString);
		possibleString.append(reversedString);
		if (reversedString.equals(givenString)) {
			System.out.println(" ' " + givenString + " ' is a polyndrom string");
		} else {
			System.out.println("\n polyndrom string is : ' " + possibleString + " ' ");
		}
	}
}
