//53.	W A P FOR converts a decimal number into binary?
package com.sssvt.general.javaprogram;
import java.util.ArrayList;

/**
 * @author smamilla
 *
 */
public class Decimal2Binary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		
				decimal2Binary(45);
			}

			public static void decimal2Binary(int n) {
				int i;
				ArrayList<Integer> al = new ArrayList<Integer>();
				while (n != 0) {
					i = n % 2;
					al.add(i);
					n = n / 2;
				}
				if (al != null) {
					for (int k = al.size() - 1; k >= 0; k--) {
						System.out.print(al.get(k));
					}
				}
			}
		}
