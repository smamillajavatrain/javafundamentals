//25.1*1*1+2*2*2+---------+n*n*n=(n*n(n+1)*(n+1))/4
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SumOfCubes {
	public static void main(String args[]) {
		int sum, n = 2;
		sum = sumOfCubes(n);
		System.out.println("sum of cubes upto " + n + " numbers = " + sum);
	}

	public static int sumOfCubes(int n) {
		int s;
		s = ((n * n) * (n + 1) * (n + 1)) / 4;
		return s;
	}

}
