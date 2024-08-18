/**
 * 
 */
package com.sssvt.java.practice.switchcaseprograms;

/**
 * @author smamilla
 *
 */
public class Polindram {

	/**
	 * @param args
	 */
	/*
	 * 1. main method is the starting point of a java stand alone program
	 * 2. main is required to call the reverse method
	 *    who is calling reverse method   main method
	 *    who called reverse()  
	 *    
	 *    actual parameter is coming from calling method
	 *    where as formal parameters defined at called method
	 *    
	 *    Advantages of functions
	 *    1. Simple to Write
	 *    2. Easy to read and easy to debug a function
	 *    3. Easy to main the methods
	 *    4. A method can be called n number of times 
	 *        methods provide re usability  concepts
	 *        
	 *     	declaring a method
	 *      ret-type met-name(parameters);
	 *      
	 *      definition of a method or implementing a method or implementation 
	 *      ret-type met-name(parameters){
	 *      
	 *      }
	 *    
	 */
	public static void main(String[] args) { // calling method for reverse method
		int num = 324, input = num;
		int sum = reverse(num); // actual parameters
		if (input == sum)
			System.out.println("Given number is Polindram " + input);
		else
			System.out.println("Given number is not a Polindram " + input);
	}

	public static int reverse(int num) { // called method  formal parameter
		int sum = 0;
		while (num != 0) {
			int Digit = num % 10;
			sum = sum * 10 + Digit;
			num /= 10;
		}
		return sum;
	}
}