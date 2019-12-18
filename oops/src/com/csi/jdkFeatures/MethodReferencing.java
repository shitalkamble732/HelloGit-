package com.csi.jdkFeatures;

interface ProductData
{
	void get();
}

public class MethodReferencing {
	
	 public static void push()//refrences static method
	 {
	 	System.out.println("it's a static method.........");
	 }
	 
	public static void main(String[] args) {
		ProductData cc=MethodReferencing::push;
		cc.get();
		
	}

}
