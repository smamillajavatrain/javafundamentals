/**
 * 
 */
package com.sssvt.java.practice.switchcaseprograms;

/**
 * @author smamilla
 *
 */
public class AbstractDemoImpl extends AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractDemo obj = new AbstractDemoImpl();
		obj.disp();
		obj.demo();
	}
	
	public void disp() {
		super.disp();
		System.out.println("Hello this is from Sub class disp() method");
	}
	
	public static void demo() {
//		super.demo();
		System.out.println("Hello this is from Sub class");
	}

	@Override
	void add() {
		
	}

	@Override
	void add(int a) {
		
	}

}
