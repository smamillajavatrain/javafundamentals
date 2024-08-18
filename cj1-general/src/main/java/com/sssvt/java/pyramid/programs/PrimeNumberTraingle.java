/**
 * 
 */
package com.sssvt.java.pyramid.programs;

/**
 * @author smamilla
 *
 */
public class PrimeNumberTraingle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int i, j, rows = 7;
		   int counter = 2;
		    
		   System.out.print("Enter the number of rows\n");
		     
		   for (i = 1; i <= rows; i++) {
		      for (j = 1; j <= i; j++) {
		 /* Try to find next prime number by 
		 incrementing counter and testing it for primality */
		        while(isPrimeNumber(counter)!=1){
		            counter++;
		 }
		        System.out.printf("%d ", counter);
		        counter++;
		      }
		      System.out.print("\n");
		   }
		   return;

	}

	static int isPrimeNumber(int counter) {
		   int i, isPrime = 1;
		   for (i = 2; i <= (counter/2); i++) {
		      if (counter % i == 0){
		         isPrime = 0;
		         break;
		      }
		   }
		   if (isPrime==1 || counter==2)
		      return 1;
		   else
		      return 0;
	}

}
