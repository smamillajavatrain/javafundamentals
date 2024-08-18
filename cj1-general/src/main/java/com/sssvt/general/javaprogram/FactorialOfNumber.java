//9.	W A P FOR Factorial of a given numbers?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class FactorialOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
				fact(6);

			}

			public static long fact(int n) {
				long fact = 1;
				if (n < 0) {
					System.out.println(1);

				} else {
					for (int i = 1; i <= n; i++) {
						fact = fact * i;

					}
					System.out.println("factorial of a number :" + fact);
				}
				 return fact;
			}

		}
		/*
		 * output: factorial of a number :720s
		 */
