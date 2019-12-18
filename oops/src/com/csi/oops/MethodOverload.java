/**
 * 
 */
package com.csi.oops;

/**
 * @author DELL
 *
 */
public class MethodOverload {

	/**
	 * @param args
	 */
	int Id;
	String Name;
	String Address;
	void display(int Id, String Name)
	{
		System.out.println("Id = "+Id+"\n Name = "+Name);
	}
	void display(String Address )
	{
		System.out.println("Address = "+Address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload m=new MethodOverload();
		m.display(1, "Pooja");
		m.display("Pune");
		

	}

}
