/**
 * 
 */
package com.sssvt.general.fundamentals;

/**
 * @author smamilla
 *
 */
public class AssignmentOperatorDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 12, c = 13;
		System.out.println("Before executing values of a and c are "+a+", "+c);
		c = c + a;  // c = 25
		System.out.println("value of c is "+c);
		a+=c;  // a = a + c;
		a-=c;
		a*=c;
		a/=c;
		a%=c;
		System.out.println("value of a  is "+a);
	}

}
