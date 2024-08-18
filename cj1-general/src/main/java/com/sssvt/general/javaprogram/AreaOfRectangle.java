
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class AreaOfRectangle {

	/**
	 * @param args
	 */
	
			public static void main(String[] args) {
				
				areaOfRectangle(4,5);
				AreaOfRectangle.areaOfRectangle(12,4);

			}
			/**
			 * 
			 * @param hieght
			 * @param width
			 */
			public static void areaOfRectangle(int hieght,int width){
				int area = hieght * width;
				System.out.println("Area of Rectangle :" + area);
			}

		}

		/*
		 * output: Area of Rectangle :15
		 */
