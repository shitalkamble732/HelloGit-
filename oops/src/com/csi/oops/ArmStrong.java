/**
 * 
 */
package com.csi.oops;

/**
 * @author DELL
 *
 */
public class ArmStrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=153;
		int temp, sum=0,a;
		System.out.println("Num = "+num);
		temp=num;
		while(num > 0)
		{
			a=num%10;
			num=num /10;
			sum=sum +(a*a*a);
		}
		
		// TODO Auto-generated method stub
		if(temp == sum)
		{
			System.out.println("is armstrong number");
		}
		else
		{
			System.out.println("is not armstrong num");
		}

	}

}
