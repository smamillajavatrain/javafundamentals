//10.	W A P FOR Factorial of a given using Recursion?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class FactorialNumberRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		factorial(5);
	}
	public static void factorial(int a){
							 
				int r= fact(a);
				 
				 
				System.out.println("Factorial of "+a+" is: " + r);
				
				}
				 
				public static int fact(int b)	{
				if(b <= 1)

				return 1;
				else
				return b * fact(b-1);
			

			}

		}
		/*
		output:
		Factorial of 5 is: 120
		*/