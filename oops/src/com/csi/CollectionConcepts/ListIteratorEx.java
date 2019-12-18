package com.csi.CollectionConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
	
	public static void main(String[] args) {
		
		ListIterator<String> litr= null;
		List<String> test= new ArrayList<String>();
		test.add("Pooja");
		test.add("Snehal");
		test.add("Shital");
		test.add("Pratiksha");
		test.add("priya");
		
		litr=test.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}

}
