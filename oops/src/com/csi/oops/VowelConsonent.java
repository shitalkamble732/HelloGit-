/**
 * 
 */
package com.csi.oops;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class VowelConsonent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the letter to check that this is vowel or Consonent..");
		ch =sc.next();
		/*  if(ch=="a"|| ch=="e" ||ch=="i" ||ch=="o" || ch=="u")
		{
			System.out.println("it's a Vowel...");
		}
		else
		{
			System.out.println("it's a Consonent..");
		}
		*/
		
		switch (ch) {
		case "a": 
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U": System.out.println(ch +"  is a Vowel..");
		break;

		default: System.out.println(ch +" is a Consonent...");
			break;
		}
		

	}

}
