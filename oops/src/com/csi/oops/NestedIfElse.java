/**
 * 
 */
package com.csi.oops;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class NestedIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 68;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the percentage : " );
		marks=sc.nextInt();
		
		if(marks >=68)
		{
			System.out.println("First Class Distinction..");
		}
		else if (marks <68 && marks >=60) 
		{
			System.out.println("First Class...");
		}
		else if (marks <60 && marks >=50) {
			System.out.println("Second Class...");
			
		}
		else if (marks <50 && marks >=40) {
			System.out.println("Pass Class..");
			
		}
		else {
			System.out.println("Fail...");
		}

	}

}
