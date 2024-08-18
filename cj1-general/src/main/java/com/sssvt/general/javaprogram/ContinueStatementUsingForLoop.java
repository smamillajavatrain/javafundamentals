/*
		 70.	W A P FOR for break,  continue using for loop?
		b)	If(I == J) break.

		 */
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class ContinueStatementUsingForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
             number(4);
	}
	public static void number(int n){

				for(int i=0;i<n;i++){
					for(int j=1;j<n;j++){
						System.out.println("poojitha");
						if(i==j){
							System.out.println(" puji");
							continue;
						}
					}
				}

			}

		}
		/*
		output;
		poojitha
		poojitha
		poojitha
		poojitha
		 puji
		poojitha
		poojitha
		poojitha
		poojitha
		 puji
		poojitha
		poojitha
		poojitha
		poojitha
		 puji


		*/
