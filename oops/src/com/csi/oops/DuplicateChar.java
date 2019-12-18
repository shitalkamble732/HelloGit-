/**
 * 
 */
package com.csi.oops;

/**
 * @author DELL
 *
 */
public class DuplicateChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Science";
		int count=0;
		char arr[]=str.toCharArray();
		System.out.println("Duplicate characters in strings are : \n ");
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]+"\n");
					count ++;
					break;
				}
			}
		}

	}

}
