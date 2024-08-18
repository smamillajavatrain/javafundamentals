		//67.	    1- 1/x!+1/x^2!-1/x^3!+………………….n    given n, x values are input evaluate the series.
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class FindFactorialOfPlusMinusSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		
				double sum = 1, j = 1.0, val;
				int x = 2, n = 2, t;
				if (n > 1) {
					for (int i = 1; i < n; i++) {
						t = PowerFunction.pow(x, i);
						long fact = FactorialOfNumber.fact(t);
						if (i % 2 == 1) {
							val = (-1) * (j / fact);
						} else {
							val = (1) * (j / fact);
						}

						sum = sum + val;
					}
					System.out.println("sum of the series  is: " + sum);
				}
			}

		}

