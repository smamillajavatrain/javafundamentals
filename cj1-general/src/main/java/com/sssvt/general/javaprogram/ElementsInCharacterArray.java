//73.	W A P FOR Display elements in character array?
package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class ElementsInCharacterArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	
				
				char ch[]={'s','r','i','a','n','j','n','e','y','a'};
				int l=ch.length;
				System.out.println(ch);
				elements(l,ch);
	}
	public static void elements(int l,char ch[]){
				for(int i=0;i<l;i++){
				System.out.println(ch[i]);
				}
				System.out.println("  ");
			
				

			}

		}
		/*
		output:
		srianjneya
		s
		r
		i
		a
		n
		j
		n
		e
		y
		a


		*/
