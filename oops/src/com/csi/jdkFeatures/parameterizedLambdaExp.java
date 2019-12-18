package com.csi.jdkFeatures;

interface Addition
{
	int  add(int a, int b);
	
}
public class parameterizedLambdaExp {

	public static void main(String[] args) {
		
		Addition aa=(a,b)->
		{
			System.out.println("Addition od 2 numbers : "+(a+b));
			return a;
		};
		Addition aa2=(int a, int b)->(a+b);
		{
			System.out.println("Addition : "+aa.add(10, 20));
		}
		
	}
}
