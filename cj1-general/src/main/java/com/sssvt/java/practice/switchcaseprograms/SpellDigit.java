package com.sssvt.java.practice.switchcaseprograms;

/**
 * @author smamilla
 *
 */
public class SpellDigit {

	public static void main(String[] args) {
		spelDigit(172786);

	}

	private static void spelDigit(int num) {
		num = Reverse.reverse(num);
		while (num != 0) {
			int digit = Reverse.obtainDigit(num);
			switch (digit) {
			case 0:
				System.out.print("zero\t");
				break;
			case 1:
				System.out.print("one\t");
				break;
			case 2:
				System.out.print("two\t");
				break;
			case 3:
				System.out.print("three\t");
				break;
			case 4:
				System.out.print("four\t");
				break;
			case 5:
				System.out.print("five\t");
				break;
			case 6:
				System.out.print("six\t");
				break;
			case 7:
				System.out.print("seven\t");
				break;
			case 8:
				System.out.print("eight\t");
				break;
			case 9:
				System.out.print("nine\t");
				break;
			default:
				break;
			}
			num /= 10;
		}

	}
}