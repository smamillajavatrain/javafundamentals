/**
 * 
 */
package com.sssvt.general.javaprogram.methods;

/**
 * @author smamilla    Documentation Comments
 *
 */
public class MethodDemo {

	/**
	 * @param args  Documentation Comments
	 */
	/*  Multi Line COmment
	 * every java stand alone program must start from the main method
	 who calls the main method?
	 main method called by JVM (main thread)
	 jvm main thread is responsible to call the main method
	 JVM Java Virtual Machine
	 JRE Java Run time Environment
	 JDK Java Development Kit
	public static void main(String[] args) this signature must match
	 other wise it will not run the program
	 */
	public static void main(String[] args) {
		// after executing the main method the method which returns nothing.   single line comments
		// if method is not return any thing then we have to use void
		
		System.out.println("Addition of two numbers are "+addition(4,5));
		System.out.println("Multiplication of two numbers are "+addition(4,5));
		System.out.println("Substraction of two numbers are "+addition(4,5));
		System.out.println("Division of two numbers are "+addition(4,5));
		System.out.println("Reminder of two numbers are "+addition(4,5));
	}
	
	public static int addition(int a,int b) {
		return a+b;  //2900
	}
	
	public static int multiplication(int a,int b) {
		return a*b;  //1200 lines of code
	}
	
	public static int substraction(int a,int b) {
		return a-b;  //3400
	}
	
	public static int division(int a,int b) {
		return a/b; //100
	}
	
	public static int reminder(int a,int b) {
		return a%b; //234
	}
}