/**
 * 
 */
package com.csi.oops;

/**
 * @author DELL
 *
 */
class Employee
{
	int empId=12;
	String empName ="tom";
	double Salary = 34566.78;
	// String designation = "java dev";
	// String Address= "Pune";
	

public  Employee()
{
	System.out.println("\n EmpId = "+empId+"\n empName = "+empName+"\n Salary = "+Salary);
}
public Employee(String Address, String designation)
{
	System.out.println("\n Address = "+Address+"\n designation = "+designation);
}
}
public class ConstructorEx  {

	/**
	 * @param args
	 */
	int ID;
	String Name;
	Double percentage;
	byte b;
	char c;
	long l;
	float f;
	
	public ConstructorEx ()
	{
		System.out.println("\n Student id = "+ID+"\n Student Name = "+Name+"\n Percentage = "+percentage);
		System.out.println("\n Byte = "+b+"\n Char = "+c+"\n long = "+l+"\n Float = "+f);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     ConstructorEx ee= new ConstructorEx();
     Employee e1 =  new Employee();
     Employee e2 = new Employee("pune","java dev");
	}

}
