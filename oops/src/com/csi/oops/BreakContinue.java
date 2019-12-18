/**
 * 
 */
package com.csi.oops;

/**
 * @author DELL
 *
 */
public class BreakContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Break Statement.......");
		for(i=1; i<=10; i++)
		{ 
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("Continue Statement......");
		for(i=1; i<=10; i++)
		{ 
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
