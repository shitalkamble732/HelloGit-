package com.csi.oops;

class Employee11
{
	void push()
	{
		System.out.println("I'm in class employee as a non Static");
	}
	static class Department
	{
		void pop()
		{
			System.out.println("i'm in aclass Employee but Static inner class");
		}
	}
}
public class StaticClassConcept extends Employee11 {
	public static void main(String[] args) {
		
		Employee11 ee=new Employee11();
		ee.push();

	
	}

}
