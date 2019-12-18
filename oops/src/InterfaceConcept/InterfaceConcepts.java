package InterfaceConcept;

interface Department
{
	void get(int deptId, String deptName);
	default void show(){
		System.out.println("I'm  from Default method..");
	}
	static void push()
	{
		System.out.println("I'm from static method..");
	}
	
}
interface Employee
{
	void set(int empId, String empName);
	void net(long empUID, String empDesignation, double empSalary, String empAddress);
}
abstract class Company
{
	abstract void put(int cId, String cName, String cAddress );
	void pop()
	{
		System.out.println("I'm from POP()");
	}
}

class Product  extends Company implements Department, Employee
{

	@Override
	public void get(int deptId, String deptName) {
		// TODO Auto-generated method stub
		System.out.println("\n Dept Id : "+deptId+"\n Dept Name : "+deptName);
	}

	@Override
	public void set(int empId, String empName) {
		// TODO Auto-generated method stub
		System.out.println("\n Employee Id : "+empId+"\n Employee Name : "+empName);
	}

	@Override
	public void net(long empUID, String empDesignation, double empSalary, String empAddress) {
		// TODO Auto-generated method stub
		System.out.println("\n Employee UID : "+empUID+"\n EmployeeDesignation : "+empDesignation+"\n Employee Salary : "+empSalary+"\n Employee Address : "+empAddress);
	}

	@Override
	void put(int cId, String cName, String cAddress) {
		// TODO Auto-generated method stub
		System.out.println("\n CID : "+cId+"\n Company Name : "+cName+"Company Address : "+cAddress);
		
	}
	
}
public class InterfaceConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pp=new Product();
		pp.get(23, "HR");
		pp.show();
		Department.push();
		pp.pop();
		pp.set(12, "JERRY");
		pp.net(1234, "Java Dev..", 25640, "Pune");
		pp.put(34, "CSI", "Nigdi, Pune");
	}

}
