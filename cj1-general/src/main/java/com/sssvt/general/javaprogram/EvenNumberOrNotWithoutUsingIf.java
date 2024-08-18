package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class EvenNumberOrNotWithoutUsingIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		int n=6;
		even(n);
	}
	public static void even(int n){
		String s[]={"even","odd"};
		int d=n%2;
		System.out.println("the number is "+s[d]);
	}

}
