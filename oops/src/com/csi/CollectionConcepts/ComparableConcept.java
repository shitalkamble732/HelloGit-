package com.csi.CollectionConcepts;

import java.util.ArrayList;
import java.util.Collections;

class Employee5 implements Comparable<Employee5>
{
	int empId;
	String empName;
	int empAge;
	double empSalary;
	String empAddress;
	
	
	public Employee5(int empId, String empName, int empAge, double empSalary, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", "
				+ "empSalary=" + empSalary + ", empAddress=" + empAddress + "]";
	}
	/*
	
	@Override
	public int compareTo(Employee5 ee) {
		// TODO Auto-generated method stub
		if(ee.empAge==empAge)
		{
			return 0;
		}
		else if(ee.empAge<empAge)
		{
		    return 1;
	    }
		else
		{
			return -1;
		}
		*/
	
	
	
	//apply comparable on empsalary
	
	
	/*  @Override
	public int compareTo(Employee5 ee)
	{
		if(ee.empSalary==empSalary)
		{
			return 0;
		}
		else if (ee.empSalary < empSalary)
		{
		return 1;	
		}
		else
		{
			return -1;
		}
}    */
	
	//   apply CompareTo  on empId 
	
	/*
	@Override
	public int compareTo(Employee5 ee) {
		// TODO Auto-generated method stub
		if(ee.empId==empId)
		{
			return 0;
		}
		else if(ee.empId<empId)
		{
		    return 1;
	    }
		else
		{
			return -1;
		}

	}
	
	*/
	
	@Override
	public int compareTo(Employee5 ee) {
		// TODO Auto-generated method stub
	
		return this.empName.compareTo(ee.empName);
}
}
public class ComparableConcept  {

	public static void main(String[] args) {
		
		ArrayList EmployeeList= new ArrayList<Employee5>();
		EmployeeList.add(new Employee5(121, "Pooja", 22, 53045.236, "Pune"));
		EmployeeList.add(new Employee5(125, "Snehal", 24, 53445.265, "Solapur"));
		EmployeeList.add(new Employee5(123, "Priya", 21, 45325.236, "Mumbai"));
		EmployeeList.add(new Employee5(114, "Pallavi", 27, 54045.986, "Latur"));
		EmployeeList.add(new Employee5(134, "Manisha", 23, 46045.366, "Kolhapur"));
		EmployeeList.add(new Employee5(122, "Suman", 28, 65845.624, "Udgir"));
		
		Collections.sort(EmployeeList);
		EmployeeList.forEach(System.out::println);
	}

}
