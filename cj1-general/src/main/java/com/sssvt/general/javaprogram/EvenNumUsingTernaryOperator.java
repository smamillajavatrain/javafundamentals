package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class EvenNumUsingTernaryOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		int n=7;
		even(n);
	}
	public static void even(int n){
		int result;
		int even = 0,odd = 1;
		result=(n%2==0)?even:odd;
		System.out.println(result);
		
	}

}
