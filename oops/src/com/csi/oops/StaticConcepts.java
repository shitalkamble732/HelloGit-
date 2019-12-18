package com.csi.oops;

public class StaticConcepts {

	static  String empName ="TOM";
	int empId = 121;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticConcepts sc=new StaticConcepts();
		sc.get();
		set();
		sc.net();
	}
	void get()
		{
			System.out.println("Hey...");
			System.out.println("\n EmpName : "+empName);	
	    }
	static void set()
	{
		System.out.println("India..");
	}
	void net()
	{
		System.out.println("Pune");
		System.out.println("\n EmpId : "+empId);
	}
	static
	{
		System.out.println("It's a Static block..");
	}

}
