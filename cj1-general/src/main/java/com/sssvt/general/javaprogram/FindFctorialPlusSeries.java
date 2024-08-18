//66. 1+ 1/x!+1/x^2!+1/x^3!+………………….n    given n, x values are input evaluate the series.

package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class FindFctorialPlusSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

					double sum = 1,j = 1.0;
				int x = 2, n = 4, t;
				if (n > 1) {
					for (int i = 1; i < n; i++) {
						t = PowerFunction.pow(x, i);
						long fact = FactorialOfNumber.fact(t);
						double val = j/fact;
						sum = sum + val;
					}
					System.out.println("sum of the series  is: " + sum);
				}
			}

		}
		/*
		 * sum of the series is: 4
		 */