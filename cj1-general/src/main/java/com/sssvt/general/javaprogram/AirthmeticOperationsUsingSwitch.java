//68.	With The help of switch compute Arithmetic operations
package com.sssvt.general.javaprogram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author smamilla
 *
 */
public class AirthmeticOperationsUsingSwitch {

	/**
	 * @param args
	 */	public static void main(String[] args) throws Exception {
				menuProgram();
			}

			public static void menuProgram() throws NumberFormatException, IOException {
				int a, b, n, c;
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("1.add");
				System.out.println("2.sub");
				System.out.println("3.mul");
				System.out.println("4.div");
				System.out.println("5.moddiv");
				System.out.println("enter n value");
				n = Integer.parseInt(br.readLine());
				System.out.println("enter a value");
				a = Integer.parseInt(br.readLine());
				System.out.println("enter b value");
				b = Integer.parseInt(br.readLine());

				switch (n) {
				case 1:
					c = a + b;
					System.out.println(a + " + " + b + " = " + c);
					break;
				case 2:
					c = a - b;
					System.out.println(a + " - " + b + " = " + c);
					break;
				case 3:
					c = a * b;
					System.out.println(a + " * " + b + " = " + c);
					break;
				case 4:
					c = a / b;
					System.out.println(a + " / " + b + " = " + c);
					break;
				case 5:
					c = a % b;
					System.out.println(a + " % " + b + " = " + c);
					break;
				default:
					System.out.println("Menu Value is not Correct!");
					System.exit(0);
				}

			}
		}
		/*
		 * output: 1.add 2.sub 3.mul 4.div 5.moddiv enter n value 1 7 + 3 = 10
	 */