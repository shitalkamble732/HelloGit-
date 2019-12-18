/**
 * 
 */
package com.csi.oops;

/**
 * @author DELL
 *
 */
public class SwapNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int temp, num1=10, num2=20;
		System.out.println("Before Swapping...");
		System.out.println("\n num1 = "+num1+"\n num2 = "+num2);
		temp=num1;
		num1=num2;
		num2= temp;
		
		System.out.println("\n After swapping");
		System.out.println("\n num1 = "+num1+"\n num2 = "+num2);
		// TODO Auto-generated method stub

		//without using third variable
		
		System.out.println("\n Before swapping");
		System.out.println("\n num1 = "+num1+"\n num2 = "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("\n After swapping");
		System.out.println("\n num1 = "+num1+"\n num2 = "+num2);
		
	}

}
