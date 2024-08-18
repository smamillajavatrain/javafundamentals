//26. WAP a, a+d,a+2*d,------------are in A.P
//find out the n'th term=a+(n-1)*d and sum of n terms=(n/2)*(2*a+(n-1)*d);
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class AirthmeticProgression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a=1,d=2,n=5;
		
		airthmeticProgression(n,a,d);

	}
	public static int airthmeticProgression(int n,int a,int d){
		int sum,term;
		term=a+(n-1)*d;
		System.out.println(n+" term is: "+term);
		sum=(n/2)*(2*a+(n-1)*d);
		System.out.println("sum of "+n+" terms: "+sum );
		return term;
		
		
		
	}

}
