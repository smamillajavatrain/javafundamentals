////22.	W A P FOR multiplication of individual digits of a given number 420? O/p: 4*2*0=0.
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class IndividualDigtsMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
           digitsMul(531);
	}
	public static void digitsMul(int n){
		           int r=0;
				int mul=1;
				System.out.println("the number: " +n);
				while(n>0)
				{
					r=n%10;
					mul=mul*r;
					n=n/10;
				}
				System.out.println("multiflication of the number : "+mul);

			}

		}
		/*
		output:
		the number: 531
		multiflication of the number : 15


		*/
