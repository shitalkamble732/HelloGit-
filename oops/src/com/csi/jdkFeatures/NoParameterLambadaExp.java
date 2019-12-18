package com.csi.jdkFeatures;
interface Customer1
{
	//void display();
	public String display(String name);
}


public class NoParameterLambadaExp {
	public static void main(String[] args) {
		
		Customer1 cc=(name)->
		{
			return  "Hello "+name;
		};
		System.out.println(cc.display("Pooja"));
		
		Customer1 cc1=(name)->
		{
			return "Hello "+name;
		};
		System.out.println(cc1.display("Priya"));
		
	}

}
