package com.csi.jdkFeatures;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

interface CustomerDetails
{
	static void display(int custId, String custName)
	{
		System.out.println("\n Cust Id : "+custId+"\n custName : "+custName);
	}
	default void show(String custAddress)
	{
		System.out.println("\n Customer Address : "+custAddress);
	}
	
}
public class StaticDefaultMethods implements CustomerDetails {
	
	public static void main(String[] args) {
		
		StaticDefaultMethods cd=new StaticDefaultMethods(); 
		CustomerDetails.display(121, "Pooja");
		cd.show("Pune");
	}
	

}
