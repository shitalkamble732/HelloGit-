/**
 * 
 */
package com.csi.oops;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class palindromeNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		int num=454;
		int r,sum=0,temp;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println("it's a palindrome number");
		}
		else
		{
			System.out.println("Not palindrome number");
		}
*/
	int n, i;
	String c, ch="";
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string : ");
	c=s.nextLine();
	n=c.length();
	for(i=n-1;i>=0;i--)
	{
		ch=ch+c.charAt(i);
	}
	if(c.equals(ch))
	{
		System.out.println(" string is Palindrome "+ch);
	}
	else {
		System.out.println("string is Not Palindrome "+ch);
	}
	}
	

}
