
		//59.	Program for finding the area of circle
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class AreaOfCircle {

	/**
	 * @param args
	 */

			public static void main(String[] args) throws Exception {
				
				areaOfTriangle(5);

			}

			public static void areaOfTriangle(int n) {
				double area;

				area = ApplicationConstent.PI * (n * n);
				System.out.println("Triangle area " + area);
			}
		}
		/*
		 * output: Triangle area 12.56
		 */

