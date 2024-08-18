//65.	W A P FOR if we give an element in an array then find out the index values of that element?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class ArrayElementIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

					int arr[]={10,30,20,60,30,80,40};
					index(arr);
	}
	public static void index(int arr[]){
				System.out.println("Array lenght is "+arr.length);
				System.out.println("element      index");
				for(int i=0;i<arr.length;i++){
					System.out.println(arr[i]+"            " +i);
				}

			}

		}
		/*
		output:
		element      index
		10            0
		30            1
		20            2
		60            3
		30            4
		80            5
		40            6

		*/