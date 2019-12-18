package com.csi.CollectionConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer
{
	int custId;
	String custName;
	int custAge;
	double custSalary;
	String custAddress;
	
	
	public Customer(int custId, String custName, int custAge, double custSalary, String custAddress) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
		this.custSalary = custSalary;
		this.custAddress = custAddress;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + ","
				+ " custSalary=" + custSalary + ", custAddress=" + custAddress + "]";
	}
		
}
class AgeComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer obj1, Customer obj2) {
		// TODO Auto-generated method stub
		if(obj1.custAge ==obj2.custAge)
		{
		return 0;
		}
		else if(obj1.custAge < obj2.custAge)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
}
class NameComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		
	    return o1.custName.compareTo(o2.custName);
	}
	
}

class SalComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if(o1.custSalary==o2.custSalary)
		{
			return 0;
		}
		else if (o1.custSalary > o2.custSalary) {
			return 1;
			
		}
		else
		{
			return -1;
		}
	}
	   
}
public class ComparatorConcept {
	
       public static void main(String[] args) {
		
    	   ArrayList<Customer> CustList=new ArrayList<>();
    	   CustList.add(new Customer(123, "Rohini", 25, 45623.478, "Pune"));
    	   CustList.add(new Customer(111, "Manisha", 24, 40023.128, "Nigdi"));
    	   CustList.add(new Customer(134, "Priti", 27, 65623.423, "Dapodi"));
    	   CustList.add(new Customer(125, "Lata", 23, 42698.470, "Latur"));
    	   CustList.add(new Customer(119, "Avinash", 29, 46321.456, "Udgir"));
    	   CustList.add(new Customer(156, "Vinay", 18, 35623.432, "Nilanga"));
    	   CustList.add(new Customer(137, "Nimisha", 22, 48677.499, "Barshi"));
    	   
    	   
    	   CustList.forEach(System.out::println);
    	  
    	   System.out.println("\n Customer Age Sorting....");
    	   Collections.sort(CustList, new AgeComparator());
    	   CustList.forEach(cl->System.out.println(cl));
    	   
    	   System.out.println("\n Customer Names after sorting :  ");
    	   Collections.sort(CustList, new NameComparator());
    	   CustList.forEach(System.out::println);
    	   
    	   System.out.println("\n Customer Salary after sorting :  ");
    	   Collections.sort(CustList, new SalComparator());
    	   CustList.forEach(System.out::println);
	}
       
      
}
