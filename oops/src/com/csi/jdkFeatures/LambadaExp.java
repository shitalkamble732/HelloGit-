package com.csi.jdkFeatures;

interface Customer
{
	void  get();
}
	
public class LambadaExp {
	public static void main(String[] args) {
		
		Customer cc=()->{
			System.out.println("Welcome to cse Pune...") ;
			};
			
			
		cc.get();
	
		
		
		
		
	}

}
