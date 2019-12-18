package com.csi.CollectionConcepts;

import java.util.ArrayList;

class Employee
{
	private int empId;
	String empName;
	double Salary;
	String Address;
	public Employee(int empId, String empName, double salary, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.Salary = salary;
		this.Address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary
				+ ", Address=" + Address  + "]";
	}
	
	
}
public class EmployeeListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Employee> employeeList = new ArrayList<>();
	employeeList.add(new Employee(121, "Pooja", 50000.2356, "Pune"));
	employeeList.add(new Employee(122, "Priya", 45623.456, "Latur"));
	employeeList.add(new Employee(125, "Akshata", 65132.12, "Nigdi"));
	employeeList.add(new Employee(127, "Snehal", 43256.16, "Udgir"));
	
	
   // employeeList.forEach(emp->System.out.println(emp));
	
	employeeList.forEach(System.out::println);
	
	}

}
