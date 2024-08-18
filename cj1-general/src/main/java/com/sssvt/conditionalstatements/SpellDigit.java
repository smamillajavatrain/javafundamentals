/**
 * 
 */
package com.sssvt.conditionalstatements;

/**
 * @author smamilla
 *
 */
public class SpellDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpellDigit(123457);

	}
	private static void SpellDigit(int num) {
		num=Reverse.reverse(num);
		while(num !=0) {
		int digit=Reverse.obtainDigit(num);
		switch(digit) {
		case 0:	
			System.out.println("Zero\t");
			break;
		case 1:	
			System.out.println("One\t");
			break;	
		case 2:	
			System.out.println("Two\t");
			break;
		case 3:	
			System.out.println("Three\t");
			break;
		case 4:	
			System.out.println("Four\t");
			break;
		case 5:	
			System.out.println("Five\t");
			break;
		case 6:	
			System.out.println("Six\t");
			break;
		case 7:	
			System.out.println("Seven\t");
			break;
		case 8:	
			System.out.println("Eight\t");
			break;
		case 9:	
			System.out.println("Nine\t");
			break;
		default:
			break;
		}
		num/=10;
	}

}
}