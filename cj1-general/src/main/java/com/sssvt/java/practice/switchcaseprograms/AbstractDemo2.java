/**
 * 
 */
package com.sssvt.java.practice.switchcaseprograms;

/**
 * @author smamilla
 *
 */
public abstract class AbstractDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello I am from abstract class main method!!");
	}
	
	abstract void add();
	abstract void add(int a);
	
	public static void demo() {
		System.out.println("Hello this is from Super class");
	}
	
	public void disp() {
		System.out.println("Hello this is from Super class disp() method");
	}
}
