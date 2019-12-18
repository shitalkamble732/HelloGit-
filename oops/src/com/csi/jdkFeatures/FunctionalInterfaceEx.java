package com.csi.jdkFeatures;

interface FunctionalInterface12
{
	void get();
	
}
class customerData implements FunctionalInterface12
{

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("It's a functional interface feature in jdk 1.8 ");
	}
	
}
public class FunctionalInterfaceEx 
	{
public static void main(String[] args) {
	
	customerData cd=new customerData();
	cd.get();
}

}