//27.WAP (1-1/n)+(1-2/n)+(1-3/n)+------------=(n-1)/2;
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SumOfSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 5;
		sumOfSeries(n);
	}

	public static void sumOfSeries(int n) {
		int sum;
		sum = (n - 1) / 2;
		System.out.println("sum of series upto " + n + " numbers " + sum);
	}

}
