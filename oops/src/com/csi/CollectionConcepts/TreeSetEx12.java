package com.csi.CollectionConcepts;

import java.util.ArrayList;

class Customer11
{
	int custId;
	String custName;
	double custSalary;
	String custAddress;
	
	
	public Customer11(int custId, String custName, double custSalary, String custAddress)
	{  
		// TODO Auto-generated constructor stub
		this.custId=custId;
		this.custName=custName;
		this.custSalary=custSalary;
		this.custAddress=custAddress;
	}
	
	public String toString()
	{
		return "Customer[CustId : "+custId+"  CustName : "+custName+"  CustSalary : "+ custSalary+ "  CustAddress : "+custAddress+"]";
		
	}
}
public class TreeSetEx12 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Customer11> custList=new ArrayList<>();
		
		custList.add(new Customer11(12, "Pooja", 23456, "Nigdi"));
		custList.add(new Customer11(14, "Pallavi", 45632.22, "Pune"));
		custList.add(new Customer11(15, "Snehal", 45654.22, "PCMC Pune"));
		custList.add(new Customer11(18, "Priyanka", 35632.22, "Nilanga"));
		custList.add(new Customer11(12, "Pallavi", 45632.22, "Pune"));

		custList.forEach(System.out::println);
		
	}

}
