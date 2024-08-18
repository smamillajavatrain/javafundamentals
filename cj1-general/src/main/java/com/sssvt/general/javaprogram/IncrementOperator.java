//62. a=1; a++; ++a;   b=(a++)+(++a)+(++a)+(a++)-(a)+(a--)+(a++)+(++a)-(--a)+(++a);
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class IncrementOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
            incrementOperator(1);
	}
	public static void incrementOperator(int a){
		int b;
				System.out.println(a);
				System.out.println(a++);
				System.out.println(++a);
		           b=(a++)+(++a)+(++a)+(a++)-(a)+(a--)+(a++)+(++a)-(--a)+(++a);
				System.out.println(b);
				
				

			}

		}
		/*
		 output;
		1
		1
		3
		35

		 */
