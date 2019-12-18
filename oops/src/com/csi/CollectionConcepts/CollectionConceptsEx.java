package com.csi.CollectionConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import com.csi.oops.WhileLoop;

public class CollectionConceptsEx {
	public static void main(String[] args) {
		
		
		//  ArrayList<String> al=new ArrayList<>();
		//  LinkedList<String> al=new LinkedList<>(); 
		
		//  HashSet< String> al=new HashSet<>();
		TreeSet<String> al=new TreeSet<>();
		al.add("Sunday");
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Sunday");
		System.out.println("First element : "+al.first());
		System.out.println("Weekedays contains friday :"+al.contains("Friday"));
		System.out.println("Empty or not : "+al.isEmpty());
		System.out.println("first element in treeset : "+al.first());
		System.out.println(al.size());
		System.out.println(al.lower("Ssturday"));
	/*	Iterator<String> itr=al.iterator();
				{
			while (itr.hasNext()) {
				String weekdays = (String) itr.next();
				
			}
			System.out.println("weekdays : "+al);
				}
				
				
				*/
		//al.forEach(weekdays->System.out.println(weekdays));
		al.forEach(System.out::println);
	/*
	  
	 	for(String weekdays : al)
		{	
			System.out.println(al);
	}
	
	*/
	}
}
