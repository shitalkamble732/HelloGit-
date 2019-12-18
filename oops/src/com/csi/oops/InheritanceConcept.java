package com.csi.oops;

class Department
{
	int deptcode=12345;
	void get(int deptId, String deptName)
	{
		System.out.println("\n Dept Id : "+deptId+"\n Dept Name : "+deptName);
	}
}
class Employee12 extends Department
{
	void set(int empId, String empName)
	{
		System.out.println("\n Employee Id : "+empId+"\n Employee Name : "+empName+"\n Dept Code : "+super.deptcode);
	}
	void net(String empDesignation, String empAddress)
	{
		System.out.println("\n Designation : "+empDesignation+"\n Address : "+empAddress);
	}
}
class Company extends Employee12
{
	void push(int cId, String cName)
	{
		System.out.println("\n Company Id : "+cId+"\n Company Name : "+cName);
	}
}
public class InheritanceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          /* Department dd=new Department();
           dd.get(121, "HR");*/
           
          /* Employee12 ee=new Employee12();
           ee.set(123, "Tom");
           ee.get(121, "HR");
           ee.net("Java Dev", "PCMC");*/
		
		/* Employee12 ee=(Employee12) new Department();
		ee.get(121, "HR");
		ee.set(123, "Tom");
		ee.net("Java Dev", "PCMC");  */
		
	    Company cc= new Company();
		cc.get(121, "HR");
		cc.set(123, "Tom");
		cc.net("Java Dev", "PCMC");
		cc.push(11, "TCS");
		
		
		

	}

}
