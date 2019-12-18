/**
 * 
 */
package com.csi.oops;

/**
 * @author DELL
 *
 */
class Parent
{
	void show()
	{
		System.out.println("It's a parent class.");
	}	
}
class Child extends Parent
{
	void show()
	{
		super.show();
		System.out.println("it's a Child class");
	}
}
public class MethodOverride {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parent p1= new Child();
		p1.show();
	
	

	}

}
