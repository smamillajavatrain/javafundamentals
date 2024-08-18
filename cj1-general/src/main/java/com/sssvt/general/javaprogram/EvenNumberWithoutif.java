//7.	W A P FOR even number generation without using “if”?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class EvenNumberWithoutif {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		even(100);
	}
		public static void even(int n){
					System.out.println("even numbers");
				for(int i=0;i<n;i++){
					int e=i+2;
					i++;
					System.out.println(e);
				}
			}
}
		
		/*
		 output:
		 even numbers
		2
		4
		6
		8
		10
		12
		14
		16
		18
		20
		22
		24
		26
		28
		30
		32
		34
		36
		38
		40
		42
		44
		46
		48
		50
		52
		54
		56
		58
		60
		62
		64
		66
		68
		70
		72
		74
		76
		78
		80
		82
		84
		86
		88
		90
		92
		94
		96
		98
		100

		 * 
		 */

		
		