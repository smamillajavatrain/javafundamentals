package com.sssvt.java.practice.switchcaseprograms;

/**
 * @author smamilla
 *
 */
public class NumberFormat {

	public static void main(String[] args) {

		int age = 9;

		switch (age) {

		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("12345");
			break;
		case 6:
			System.out.println("6");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("789");
		}

	}
}
