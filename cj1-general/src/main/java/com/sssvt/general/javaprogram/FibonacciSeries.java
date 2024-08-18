//12.	W A P FOR Fibonanacci series?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fib(10);
	}
	public static void fib(int n){
					int a=0,b=1,c;
			
				System.out.println("n value :" +n);
				c=a+b;
				int i=0;
				while(i<n){
					System.out.println(c);
					a=b;
					b=c;
					c=a+b;
					i++;
				}

			}

		}
		/*
		output:
		n value :10
		1
		2
		3
		5
		8
		13
		21
		34
		55
		89


		*/
