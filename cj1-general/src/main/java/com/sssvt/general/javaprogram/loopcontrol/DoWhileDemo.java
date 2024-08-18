/**
 * 
 */
package com.sssvt.general.javaprogram.loopcontrol;

/**
 * @author smamilla
 *
 */
public class DoWhileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 11;
		// weather cond true or false at least one time do while loop stats will be executed.
		// but second time onwards if cond true then only it will execute the do loop stats
		do {
			System.out.println(num);
			num++;
		}while(num<=10);
	}
}