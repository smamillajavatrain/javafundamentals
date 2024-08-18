package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class OutputStarUptriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		number(5);
	}

	public static void number(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" * ");

			}
			System.out.println("   ");
		}

	}

}
/*
 * output:
 * 
 * * * * * * *
 * 
 * 
 */