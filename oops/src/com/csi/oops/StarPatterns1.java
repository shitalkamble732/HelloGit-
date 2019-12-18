package com.csi.oops;

public class StarPatterns1 {

	
		public static void printStars(int n )
		{
			int i, j;
		
		for(i=1; i<n; i++)
		{
			for(j=2*(n-i); j>=0; j--)
			{
				System.out.print( " ");
			}
			for(j=0; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println( " ");
		}
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n=5;
	printStars(n);
}
	
}
