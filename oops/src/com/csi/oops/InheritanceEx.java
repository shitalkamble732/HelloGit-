package com.csi.oops;

class Company1
{
	int code=123456;
	void get(int cId, String cName)
	{
		System.out.println("\n Company Id :"+cId+"\n Company Name : "+cName);
	}
}
class Customer extends Company1
{
	void set(String custName, String custDesignation, int custSalary)
	{
		System.out.println("\n Customer Name : "+custName+"\n Designation : "+custDesignation+"\n Salary : "+custSalary+"\n Company Code : "+super.code);
	}
}
class Product1 extends Customer
{
	void net(int prodId, String prodName)
	{
		System.out.println("\n Product Id = "+prodId+"\n Product Name : "+prodName);
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*  Customer cc=(Customer) new Company1();
         cc.get(123, "mi");
         cc.set("TOm", ".Net Dev", 18000);*/
		Product1 pp= new Product1();
		pp.get(123, "mi");
        pp.set("TOm", ".Net Dev", 18000);
        pp.net(1, "keyboard");
         
	}

}
