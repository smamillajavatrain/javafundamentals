//The given string is polyndrom or not
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class PolyndromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("" + polindram("srs1"));
	}

	public static boolean polindram(String givenString) {
		String reversedString;
		int length = givenString.length();
		char c;

		StringBuffer dest = new StringBuffer(length);

		for (int i = length - 1; i >= 0; i--) {
			c = givenString.charAt(i);
			dest.append(c);
		}
		reversedString = dest.toString();
		if (reversedString.equals(givenString)) {
			return true;
		} else {
			return false;
		}

	}

}
