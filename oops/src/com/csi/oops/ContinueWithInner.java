/**
 * 
 */
package com.csi.oops;

/**
 * @author DELL
 *
 */
public class ContinueWithInner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1; i<=3; i++)
		{
			for(j=1; j<=3; j++)
			{
				if(i==3 && j==1)
				{
					continue;
				}
				System.out.println(i+" "+j);
			}
		}

	}

}
