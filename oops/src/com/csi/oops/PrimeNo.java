/**
 * 
 */
package com.csi.oops;

/**
 * @author DELL
 *
 */
public class PrimeNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=31, flag=0, m;
	m=n/2;
	if(n==0 || n==1)
	{
		System.out.println("Not Prime Number");
	}
	else
	{
		for(int i=2; i<=m; i++)
		{
			if(n%i==0)
			{
				System.out.println("Not Prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("it's prime number");
	}
	
	}
	

}
