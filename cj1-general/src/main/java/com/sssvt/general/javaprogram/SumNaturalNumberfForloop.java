package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SumNaturalNumberfForloop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int sum = 0;
		int n = 1000;

		for (int i = 1; i <= n; ++i) {
			sum += i;
		}
		System.out.println("sum=" + sum);
	}

}
