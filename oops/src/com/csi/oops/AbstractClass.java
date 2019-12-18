/**
 * 
 */
package com.csi.oops;

/**
 * @author DELL
 *
 */
abstract class Base
{
	abstract void display();
	void fun()
	{
		System.out.println("function in base class");
	}
	
}
class Derived extends Base
{
 void display()
 {
	 System.out.println("Derived Function");
 }

}
public class AbstractClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Derived d=new Derived();
	 d.display();
	 d.fun();
	}
}
