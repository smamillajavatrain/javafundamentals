//1.	W A P FOR area of Triangle (1/2*a*b)?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class TriangleArea {

	/**
	 * @param args
	 */
	int a, b;

	public float area(int a, int b) {
		this.a = a;
		this.b = b;
		int c = (a * b);
		float t = (c / 2);
		System.out.println("area of traingle  " + t);
		return t;
	}

	public static void main(String[] args) {

		TriangleArea t1 = new TriangleArea();
		t1.area(2, 5);
	}

}
/*
 * area of traingle 5.0
 */
