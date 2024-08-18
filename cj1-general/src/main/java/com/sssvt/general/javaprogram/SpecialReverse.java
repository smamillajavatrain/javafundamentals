/**
 * 
 */
package com.sssvt.general.javaprogram;

import java.util.HashMap;

/**
 * @author smamilla
 *
 */
public class SpecialReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		special(12,21);
		rangeSpecial(1000);
	}
	
	public static int reverse(int n){
		int r;
		int rev=0;
//		System.out.println("number is :"+n);
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
//		System.out.println("reverse of a number  is :"+rev);
		return rev;
	}
	
	public static int square(int n){
		int s1=n*n;
//		System.out.println(n+" Square of a given number is "+s1);
		return s1;
	}
	
	public static void special(int num1,int num2) {
		int var1 = reverse(num1);
		if(var1==num2) {
			int squareNum1 = square(num1);
			int squareNum2 = square(num2);
			int var2 = reverse(squareNum2);
			if(squareNum1==var2) {
				System.out.println(num1+ " And "+num2+" are special reverse numbers");
			}else {
				System.out.println(num1+ " And "+num2+" are not special reverse numbers");
			}
		}else {
			System.out.println(num1+ " And "+num2+" are not special reverse numbers");
		}
	}
	
	public static void rangeSpecial(int range) {
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		int num1 = 0,num2 = 0;
		for(int i=0;i<=range;i++) {  // 0 to 1000
			for(int j=0;j<=range;j++) { // 0 to 1000
				num1 = i;
				num2 = j;
				int var1 = reverse(num1);
				if(var1==num2) {
					int squareNum1 = square(num1);
					int squareNum2 = square(num2);
					int var2 = reverse(squareNum2);
					if(squareNum1==var2) {
//						hashMap.put(num1, num2);
						System.out.println(num1+" = "+num2);
					}else {
						//do nothing
					}
				}else {
					//do nothing
				}
			}
		}
		System.out.println(hashMap);
	}
}