package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class StrongNumberOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		strong(145);
	}

	public static void strong(int n) {
		int a = n;
		int f = 1;
		int sum = 0;
		int r, i;

		while (n != 0) {
			i = 1;
			f = 1;
			r = n % 10;

			while (i <= r) {
				f = f * i;
				i++;
			}

			sum = sum + f;
			n = n / 10;
		}

		if (a == sum) {
			System.out.println("strong number   " + sum);
		} else {
			System.out.println("not strong number " + sum);
		}

	}
}
