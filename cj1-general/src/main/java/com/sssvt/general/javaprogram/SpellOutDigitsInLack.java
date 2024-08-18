package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class SpellOutDigitsInLack {
	public static void main(String[] args) {

		int ar[] = { 9, 4, 4, 1, 5 };
		spelloOutDigit(ar);
	}

	public static void spelloOutDigit(int arr[]) {
		int length = arr.length;
		int al = length;
		if (length <= 5 && length >= 2) {
			for (int i = 0; i < length; i++) {
				/*
				 * if(arr[al]==1){ switch(arr[i]){ case 1:System.out.println("ninetine ");
				 * break; } }
				 */
				if (al > 4 && al <= 5) {
					switch (arr[i]) {
					case 4:
						System.out.print(" Fourty");
						break;
					case 3:
						System.out.print(" Thirty");
						break;
					case 1:
						/*
						 * switch (arr[i]) { //case 1: //System.out.print("Ten "); //break; case 2:
						 * System.out.print(" "); break; case 3: System.out.print("Thirty "); break;
						 * case 4: System.out.print("Fourteen "); break; case 5:
						 * System.out.print("Fifty "); break; case 6: System.out.print("Sixty "); break;
						 * case 7: System.out.print("Seventy "); break; case 8:
						 * System.out.print("Eighty "); break; case 9: System.out.print("Ninty ");
						 * break; }
						 */
						System.out.print("one");
						break;

					case 2:
						System.out.print(" Twenty");
						break;
					case 5:
						System.out.print(" Fifty");
						break;
					case 6:
						System.out.print(" Sixty");
						break;
					case 7:
						System.out.print(" Seventy");
						break;
					case 8:
						System.out.print(" Eighty");
						break;
					case 9:
						System.out.print(" Ninty");
						break;
					// case 0:
					// System.out.print(" Zero ");
					// break;

					}

				}
				if (al >= 3 && al <= 4) {
					switch (arr[i]) {
					case 4:
						System.out.print(" Four ");
						break;
					case 3:
						System.out.print(" Three ");
						break;
					case 1:
						System.out.print(" One ");
						break;
					case 2:
						System.out.print(" Two ");
						break;
					case 5:
						System.out.print(" Five ");
						break;
					case 6:
						System.out.print(" Six ");
						break;
					case 7:
						System.out.print(" Seven ");
						break;
					case 8:
						System.out.print(" Eight ");
						break;
					case 9:
						System.out.print(" Nine ");
						break;
					case 0:
						System.out.print(" Zero ");
						break;
					}
				}
				if (al <= 5 && al >= 2) {
					switch (al) {

					case 4:
						System.out.print("Thousand And ");
						break;
					case 3:
						System.out.print("Hundreed And ");
						break;
					}
				}
				if (al <= 2) {
					switch (al) {
					case 2:
						switch (arr[i]) {
						case 1:
							System.out.print("Ten ");
							break;
						case 2:
							System.out.print("Twenty ");
							break;
						case 3:
							System.out.print("Thirty ");
							break;
						case 4:
							System.out.print("Fourty ");
							break;
						case 5:
							System.out.print("Fifty ");
							break;
						case 6:
							System.out.print("Sixty ");
							break;
						case 7:
							System.out.print("Seventy ");
							break;
						case 8:
							System.out.print("Eighty ");
							break;
						case 9:
							System.out.print("Ninty ");
							break;
						}
						break;
					case 1:
						switch (arr[i]) {
						case 4:
							System.out.print(" Four ");
							break;
						case 3:
							System.out.print(" Three ");
							break;
						case 1:
							System.out.print(" One ");
							break;
						case 2:
							System.out.print(" Two ");
							break;
						case 5:
							System.out.print(" Five ");
							break;
						case 6:
							System.out.print(" Six ");
							break;
						case 7:
							System.out.print(" Seven ");
							break;
						case 8:
							System.out.print(" Eight ");
							break;
						case 9:
							System.out.print(" Nine ");
							break;

						}
						break;
					}

				}
				al--;
			}
		}
	}
}
