package com.csi.jdkFeatures;

interface Addable
{
	String display(String msg);
}
public class LambdaEx {
	public static void main(String[] args) {
		
		Addable aa=(msg)->
		{
			String str1 =  "I would like to say that ";
			String str2=str1+msg;
			return str2;
		};
		
		System.out.println(aa.display("Time is Precious"));
	}

}
