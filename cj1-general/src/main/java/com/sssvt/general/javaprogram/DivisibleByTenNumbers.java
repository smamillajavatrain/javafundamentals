		//36.	 W A P FOR prints the series of number which are divisible by 10 up to 200(n)?
		// i) We need to pass the N value in run time. 
	
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class DivisibleByTenNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		
				divNumber(10,200);

			}

			public static void divNumber(int n, int m) {
				System.out.println("divisible by " + n + " upto " + m + " numbers");

				for (int i = 1; i <= m; i++) {
					int s = i % n;
					if (s == 0) {
						System.out.println(i);
					}
				}
			}
		}

		/*
		 * output: enter n value 200 divisible by 10 upto200 numbers 10 20 30 40 50 60
		 * 70 80 90 100 110 120 130 140 150 160 170 180 190 200
		 */

