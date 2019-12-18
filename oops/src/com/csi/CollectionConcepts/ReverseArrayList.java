package com.csi.CollectionConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseArrayList {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Before sorting iterating the elements : "+al);
		
		Iterator<Integer> itr2=al.iterator();
		Collections.reverse(al);
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
			
		}
		System.out.println("after sorting the elements : "+al);
	}

}
