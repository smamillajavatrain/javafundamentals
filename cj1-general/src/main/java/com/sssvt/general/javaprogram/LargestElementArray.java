//5.	W A P FOR Largest element in array?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class LargestElementArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		largestEleArray();
	}

	public static void largestEleArray() {
		int a[] = { 1, 4111, 946, 100 };
		int temp;
		temp = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > temp) {
				temp = a[i];
			}

		}
		System.out.println("Largest Element is " + temp);
	}
}
/*
 * output:Largest Element is 4111
 * 
 */
