
//24. 1*1+2*2+3*3+------+n*n=(n*(n+1)*(2*n+1))/6
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SumOfSqures {

	public static void main(String[] args) {

		int sum, n = 2;
		sum = sumOfSqures(n);
		System.out.println("sum of squres upto " + n + " numbers = " + sum);
	}

	public static int sumOfSqures(int n) {

		int s = (n * (n + 1) * (2 * n + 1)) / 6;
		return s;
	}
}
