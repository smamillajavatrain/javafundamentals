package com.sssvt.general.javaprogram;

import java.util.ArrayList;

/**
 * @author smamilla
 *
 */
public class polindrom {

	// int p=1221;

	static int poly(int p) {
		int y;
		int t = 0;
		while (p > 0) {
			y = p % 10;
			t = t * 10 + y;
			p = p / 10;
		}
		return t;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		int[] k = { 1, 2, 4 };
		for(int j = 0;j<k.length;j++){
			al.add(k[j]);
			System.out.println(al.get(j));
		}
		int u = 0;
		for (int n = k.length-1; n >= 0; n--) {
			u = poly(k[n]);
			al1.add(u);
			
			
		}
		if(al.equals(al1)){
			System.out.println("Polindram Number");
		}else{
			System.out.println("Not a Polindram Number");
		}
	}
}