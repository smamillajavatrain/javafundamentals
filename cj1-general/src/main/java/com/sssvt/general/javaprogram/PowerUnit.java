//60.	W A P FOR find out the power unit rate

package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class PowerUnit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int unitsPerMonth;
		int totalPrice = 1;
		System.out.println(" Sno  Item                     Unit          Total Price");
		unitsPerMonth = 20;
		totalPrice = unitsPerMonth * ApplicationConstent.HOUSE_UNIT_RATE;
		System.out.print(" 1    ");
		System.out.println("House                     " + unitsPerMonth + "             " + totalPrice);
		unitsPerMonth = 140;
		totalPrice = unitsPerMonth * ApplicationConstent.SHOPPING_UNIT_RATE;
		System.out.print(" 2    ");
		System.out.println("Shopping Complex          " + unitsPerMonth + "             " + totalPrice);
		unitsPerMonth = 1000;
		totalPrice = unitsPerMonth * ApplicationConstent.SOFTWARE_UNIT_RATE;
		System.out.print(" 3    ");
		System.out.println("softwere Company          " + unitsPerMonth + "            " + totalPrice);

	}

}
/*
 * output: item unit totalprice House 20 60 Shopping Complex 140 1960 softwere
 * Company 1000 24000
 * 
 */
