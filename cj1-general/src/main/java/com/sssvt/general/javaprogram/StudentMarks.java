//51. find student percentage
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class StudentMarks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String sname = "puji";
		int sno = 531;
		System.out.println(" Name " + sname);
		System.out.println(" studentno " + sno);
		;
		marks(60, 50, 70);
	}

	public static void marks(int m1, int m2, int m3) {
		int sum = m1 + m2 + m3;
		int per = sum / 3;
		if (per >= 75) {
			System.out.println(" I class ");
		} else if (per >= 60 || per <= 74) {
			System.out.println(" II class ");
		} else if (per >= 45 || per <= 59) {
			System.out.println(" III class ");
		} else if (per >= 35 || per <= 44) {
			System.out.println(" IV class ");
		} else if (per >= 0 || per <= 34) {
			System.out.println(" Fail ");
		}
	}

}
/*
 * output; Name puji studentno 531 II class
 * 
 */
