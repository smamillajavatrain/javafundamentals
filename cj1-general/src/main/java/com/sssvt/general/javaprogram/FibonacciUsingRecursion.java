//12.	W A P FOR Fibonanacci series?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class FibonacciUsingRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		    fibonacci(10);
	}
	public static void fibonacci(int m){
				
				int r= fib(m);
		    System.out.println(r);
			}

			static int fib(int n){
		    	if(n<2)
		              return 1;
		    		else
		    			return (fib(n-1)+fib(n-2));
		    	
		    		}
			

		}
		/*
		output;
		89
		*/

