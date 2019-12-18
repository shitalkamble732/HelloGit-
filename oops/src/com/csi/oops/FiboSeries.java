/**
 * 
 */
package com.csi.oops;

/**
 * @author DELL
 *
 */
public class FiboSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=10, f1=0, f2=1,f3;
		for(int i=1; i<=n; i++)
		{
			System.out.println(f1 +"\n");
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		// TODO Auto-generated method stub

	}

}
