/**
 * 
 */
package com.csi.oops;


		
		public class StarPatterns {

			/**
			 * @param args
			 */
			public static void main(String[] args) {
				int i,j;
				for( i=1; i<7; i++)
				{
					for( j=1; j<i; j++)
					{
						System.out.print(" * ");
						
					}
					System.out.println(" ");

				}
				// TODO Auto-generated method stub
				
				System.out.println("print the mirrored angle triangle.... ");
				for(i=0; i<6; i++)
				{
					for(j=5; j>i; j--)
					{
						System.out.print(" * ");
					}
					System.out.println(" ");
				}
				System.out.println("");
	}

}
