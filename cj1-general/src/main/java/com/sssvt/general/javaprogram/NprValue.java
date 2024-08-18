//79.	W A P FOR fined npr value?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class NprValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		nprValue(4, 2);
	}

	public static void nprValue(int n, int r) {
		int npr = (int) (FactorialOfNumber.fact(n) / FactorialOfNumber.fact(n - r));
		System.out.println(n + "p" + r + "  value is: " + npr);
	}

}
/*
 * output:
 * 
 * 4p2 value is: 12
 * 
 */
