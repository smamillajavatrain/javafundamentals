package com.sssvt.general.javaprogram;

//30.	W A P FOR sum of N number series?
/**
 * @author smamilla
 *
 */
public class SumOfNaturalNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		naturalSum(100);
	}

	public static void naturalSum(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {

			sum = sum + i;

		}
		System.out.println("sum of even numbers from 1 to 100 : " + sum);

	}

}
/*
 * output: sum of even numbers from 1 to 100 : 4950
 * 
 */