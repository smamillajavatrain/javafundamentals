package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class Simple {

	/**
	 * @param args
	 */
	private void met(int a) {
		System.out.println("base mth");
	}
}

class Sub extends Simple {
	public void met(int d) {
		System.out.println("sub class");
	}

	public static void main(String[] args) {

		Sub s = new Sub();
		int a = 0;
		s.met(a);
	}

}
