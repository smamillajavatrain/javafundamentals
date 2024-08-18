package com.sssvt.general.javaprogram;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] a = { 12, 100, 42, 56, 78, 79 };
		//          0    1    2   3   4   5
		// a[0], a[1], a[2], a[3],  ... a[6] ---???
		// array is a fixed size of length
		// in run time we can't change the size of the array.
		// Array Index out of bounce exception will come.
		
//		int a1[] = { 12, 100, 42, 56, 78, 79 };
//		int []a11 = { 12, 100, 42, 56, 78, 79 };
		System.out.println("Array Length  --> "+a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);// a[0]
//			Arrays.sort(a[i]);
		}
		System.out.println(a[6]);
/*
   intialization  i = 0; very first time
   then cond check
   if cond true execute the for loop statements/for loop block statements
   is 0 less than 6 cond true or false?  true
   cond true it will execute loop stats then it will go for incremet/decrement area
   i++ --> i = i + 1;i == 1;
 */
	}

}
