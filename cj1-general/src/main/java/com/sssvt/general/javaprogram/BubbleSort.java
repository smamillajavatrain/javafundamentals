//64.	W A P FOR for BUBBLE sort?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class BubbleSort {
	
		public static void main(String[] args)throws Exception {
			int a[]={10,30,20,80,50};
			int l=a.length;
			System.out.println("array elements");
			for(int i=0;i<l;i++){
				System.out.println(a[i]);
			}
			System.out.println("            ");
			bsort(a,l);
			

		}
		
		
	    static void bsort(int a[],int l){
	    	System.out.println("after sorting");
	    	for(int i=0;i<l-1;i++){
	    		for(int j=0;j<l-1;j++){
	    			if(a[j]>a[j+1]){
	    				int k=a[j];
	    				a[j]=a[j+1];
	    				a[j+1]=k;
	    			}
	    	
	    		}
	    		
	    		System.out.println(a[i]);
	    	}
	    	
	    	return;	
	    }
	}
	/*
	 
	 output:
	 array elements
	10
	30
	20
	80
	50
	            
	after sorting
	10
	20
	30
	50


	*/
