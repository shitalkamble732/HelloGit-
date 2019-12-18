package com.csi.CollectionConcepts;

import java.util.TreeSet;

class Employee90 implements Comparable
{
	String name;
	int empId;
	
	public Employee90(String name, int empId) {
		//super();
		this.name = name;
		this.empId = empId;
	}
	public String toString()
	{
		return  name+"   "+empId;	
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		int empId1=this.empId;
		Employee90 ee=(Employee90) obj;
		int empId2=ee.empId;
		if(empId1<empId2)
		{
			return -1;
		}
		else if(empId1>empId2)
		{
			return +1;
		}
		else
		{
		return 0;
		}
	}
}

public class TreeSetExEmployee {
	public static void main(String[] args) {
		
		
		Employee90 e1=new Employee90("Pooja", 111);
		Employee90 e2=new Employee90("Varsha", 112);
		Employee90 e3=new Employee90("Priya", 113);
	/*	TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println(t);
		
		*/
		
		TreeSet t1 =new TreeSet(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		System.out.println(t1);
		

	}

}
