/**
 * 
 */
package com.csi.oops;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		marks=sc.nextInt();
		if(marks > 75)
		{
			System.out.println("First class distinction..");
		}
		else if (marks >= 60) 
		{
			System.out.println("First Class..");
		}
		else if (marks >= 35)
		{
		System.out.println("Second Class..");	
		}
		else
		{
			System.out.println("Fail..");
		}

	}

}
