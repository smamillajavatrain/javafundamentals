//50.	W A P FOR given number 896? o/p prints the:  eight nine six.
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class NumberToCharacters {
	public static void main(String args[]) {
		number(531);
	}

	public static void number(int n) {

		int r;

		int rev = 0;
		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}

		while (rev != 0) {
			switch (rev % 10) {
			case 0:
				System.out.print("zero ");
				break;
			case 1:
				System.out.print("one ");
				break;
			case 2:
				System.out.print("two ");
				break;
			case 3:
				System.out.print("three ");
				break;
			case 4:
				System.out.print("four ");
				break;
			case 5:
				System.out.print("five ");
				break;
			case 6:
				System.out.print("six ");
				break;
			case 7:
				System.out.print("seven ");
				break;
			case 8:
				System.out.print("eight ");
				break;
			case 9:
				System.out.print("nine ");
				break;
			default:
				System.out.println(" no number ");

			}

			rev = rev / 10;

		}
	}

}
/*
 * output: two three one
 */