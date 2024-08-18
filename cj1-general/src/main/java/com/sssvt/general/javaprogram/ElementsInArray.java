//63.	W A P FOR Find out the elements in an array?

package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class ElementsInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			int arr[] = { 10, 30, 20, 60, 30, 80, 40 };
				displayArrayElements(arr);

			}

			public static void displayArrayElements(int arr[]) {
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
			}
		}
		/*
		 * output: 10 30 20 60 30 80 40
		 */

