
/* 50. This class will take the String as input and process the 
 * String where it has only numbers or not
 */
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SpellOutNum {

	/**
	 * @param args
	 */

	public static void main(String... strings) {
		String s = "850";
		SpellOutNum obj = new SpellOutNum();
		obj.findByCharacter(s);

	}

	public String findByCharacter(String source) {

		int len = source.length();
		StringBuffer dest = new StringBuffer(len);
		boolean b = false;
		for (int i = 0; i <= len - 1; i++) {
			b = fun(source.charAt(i));
			if (b) {
				dest.append(source.charAt(i));
			} else {

				System.out.println("This is not a Number");
				return null;

			}

		}

		String str = dest.toString();
		System.out.println();
		System.out.println("This is a Number " + str);
		return str;
	}

	public boolean fun(char c) {
		switch (c) {
		case '0':
			if (c == '0')
				System.out.print(" Zero ");
			return true;
		case '1':
			if (c == '1')
				System.out.print(" One ");
			return true;
		case '2':
			if (c == '2')
				System.out.print(" Two ");
			return true;
		case '3':
			if (c == '3')
				System.out.print(" Three ");
			return true;
		case '4':
			if (c == '4')
				System.out.print(" Four ");
			return true;
		case '5':
			if (c == '5')
				System.out.print(" Five ");
			return true;
		case '6':
			if (c == '6')
				System.out.print(" Six ");
			return true;
		case '7':
			if (c == '7')
				System.out.print(" Seven ");
			return true;
		case '8':
			if (c == '8')
				System.out.print(" Eight ");
			return true;
		case '9':
			if (c == '9')
				System.out.print(" Nine ");
			return true;
		case '.':
			if (c == '.')
				System.out.print(" . ");
			return true;
		default:
			return false;
		}

	}
}
