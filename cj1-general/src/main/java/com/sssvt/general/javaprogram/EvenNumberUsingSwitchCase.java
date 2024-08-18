package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class EvenNumberUsingSwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		int n=43;
		even(n);
	}
	public static void even(int n){
		int d;
		d=n%2;
		switch(d){
		case 0: System.out.println(n+" is even number ");
		break;
		case 1: System.out.println(n+" is odd number ");
		break;
		}
	}

}
