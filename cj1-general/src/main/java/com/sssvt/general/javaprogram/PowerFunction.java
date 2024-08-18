/** 46.
		 *  This Program will give the pow functionality
		 *  EX pow(3,2) output : 9
		 */

package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class PowerFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = pow(x, y);
		System.out.println(z);

	}

	public static int pow(int x, int y) {

		int z = 0;
		if (y == 1) {
			return x;
		} else if (y == 0) {
			return 1;
		} else {
			z = 1;
			for (int j = 1; j <= y; j++) {
				z *= x;

			}
			return z;

		}

	}
}
