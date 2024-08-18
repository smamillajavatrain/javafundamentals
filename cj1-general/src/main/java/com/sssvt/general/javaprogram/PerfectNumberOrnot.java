//35.WAP for given number is perfect or not
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class PerfectNumberOrnot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 28;
		perfect(n);
	}

	public static void perfect(int n) {
		int perfect = 0, num = n;
		// System.out.println("the factors are");
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				perfect = perfect + i;
				// System.out.println(i);
			}
		}
		if (perfect == num) {
			System.out.println("perfect number");
			System.out.println(perfect);
		} /*
			 * else{ System.out.println("not perfect number"); }
			 */
	}

}
