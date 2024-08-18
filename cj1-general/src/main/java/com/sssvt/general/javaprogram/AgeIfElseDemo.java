/**
 * 
 */
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class AgeIfElseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int voterEligible = 18;
		int personAge = 121;
		if(personAge<voterEligible) {
			System.out.println("Person is not eligible for vote");
		}else {
			System.out.println("Eligible for vote!!");
		}
	}

}
