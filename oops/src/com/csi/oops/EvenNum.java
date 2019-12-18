/**
 * 
 */
package com.csi.oops;

import java.util.Scanner;
/**
 * @author DELL
 *
 */
public class EvenNum {


	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = s.nextInt();
		if(num % 2== 0)
		{
			System.out.println(num+" is even");
		}
		else
		{
			System.out.println(num +"is odd");
		}
		// TODO Auto-generated method stub

	}

}
