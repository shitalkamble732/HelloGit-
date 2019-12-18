package com.csi.CollectionConcepts;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator
{
/*
	@Override
	public int compare(Integer obj1, Integer obj2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer) obj1;
		Integer i2=(Integer) obj2;
		if(i1<i2)
		{
			return +1;
		}
		else if (i1>i2) {
			return -1;
		}
		return 0;
	}
	
	*/
	public int compare(Object obj1, Object obj2)
	{
		String s1=(String) obj1;
		String s2=(String) obj2;
		
		return s1.compareTo(s2);
	}
}
public class TreeSetDescendingOrderEx extends MyComparator {
	public static void main(String[] args) {
		
	/*	TreeSet<Integer> t= new TreeSet (new MyComparator());
		t.add(23);
		t.add(15);
		t.add(0);
		t.add(45);
		t.add(21);
		t.add(15);
		
		for (Integer Num : t) {

			System.out.println(Num);
		}
		*/
		
		TreeSet<String> t= new TreeSet (new MyComparator());
		t.add("Pooja");
		t.add("Divya");
		t.add("Snehal");
		t.add("Pallavi");
		
		for(String names :t)
		{
			System.out.println(names);
		}
	}

}
