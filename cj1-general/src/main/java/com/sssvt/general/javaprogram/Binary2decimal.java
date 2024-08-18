	//54. Converts a binary number into decima
package com.sssvt.general.javaprogram;
import java.util.ArrayList;

/**
 * @author smamilla
 *
 */
public class Binary2decimal {

	/**
	 * @param args
	 */
	

			
		public static void main(String[] args) {
				
				binary2Decimal(1010);
			}

			/**
			 * 
			 */
			@SuppressWarnings("unchecked")
			public static void binary2Decimal(long str) {
				ArrayList<Long> al = new ArrayList<Long>();
				 long k;
				int m;
				long disp = 0;
				al = IndividualDigit.individualDigits(str);
				for (int i = 0; i < al.size(); i++) {
					k = al.get(i);
					m = PowerFunction.pow(2, i);
					disp = disp + (k * m);
				}
				System.out.println(disp);
			}

		}

