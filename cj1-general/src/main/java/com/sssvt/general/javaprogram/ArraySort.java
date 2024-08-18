//6.	W A P FOR sorting an array?
package com.sssvt.general.javaprogram;

/**
 * This program will sort the elements in two ways
 * 1. Using Arrays.sort () method
 * 2. Using BubbleSort
 */
import java.util.Arrays;

/**
 * 
 * @author Srikanth
 * 
 */
public class ArraySort {
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		sortArray();
	}
	/**
	 * 
	 */
	public static void sortArray() {

		int a[] = { 5, 8, 4, 2, 7 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int i;
		int array[] = { 12, 9, 4, 99, 120, 1, 3, 10 };
		System.out.println("Values Before the sort:\n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();
		bubble_srt(array, array.length);
		System.out.print("Values after the sort:\n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();
		System.out.println("PAUSE");

	}

	/**
	 * 
	 * @param a
	 * @param n
	 */
	public static void bubble_srt(int a[], int n) {
		int i, j, t = 0;
		for (i = 0; i < n; i++) {
			for (j = 1; j < (n - i); j++) {
				if (a[j - 1] > a[j]) {
					t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
				}
			}
		}
	}

}

