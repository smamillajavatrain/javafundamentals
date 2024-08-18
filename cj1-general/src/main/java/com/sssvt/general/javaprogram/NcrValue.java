//80.	W A P FOR find ncr value?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class NcrValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ncrValue(4, 2);
	}

	public static void ncrValue(int n, int r) {
		int t = (int) (FactorialOfNumber.fact(r) * FactorialOfNumber.fact(n - r));
		int ncr = (int) (FactorialOfNumber.fact(n) / t);
		System.out.println(n + "c" + r + "  value is: " + ncr);
	}

}
/*
 * output: 4c2 value is: 6
 * 
 */
