//52.	W A P FOR LCM of two numbers?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class LcmOfTwoNumbers {

	public int lcm(int m, int n) {
		int a, b;
		if (m > n) {
			a = m;
			b = n;
		} else {
			a = n;
			b = m;
		}
		for (int i = 1; i <= b; i++) {
			if ((a * i) % b == 0) {
				return i * a;
			}
		}
		return 1;

	}

	public static void main(String[] args) throws Exception {
		LcmOfTwoNumbers lc = new LcmOfTwoNumbers();
		int d = lc.lcm(8, 16);
		System.out.println("Lcm of 2 and 8  :" + d);

	}

}
/*
 * output: Lcm of 2 and 8 : 8
 */