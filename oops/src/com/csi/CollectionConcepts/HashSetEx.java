package com.csi.CollectionConcepts;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet <String> h=new HashSet<>();
		h.add("Cse");
		h.add("It");
		h.add("65");
		h.add("Mech");
		h.add("It");
		h.add("Civil");
		h.add("10");
		h.add(null);
		for(String brName : h)
		{
			System.out.println(brName);
		}
		
		System.out.println("-------LinkedHashSet----------------");
		
		LinkedHashSet <String> h1=new LinkedHashSet<>();
		h1.add("Cse");
		h1.add("It");
		h1.add("65");
		h1.add("Mech");
		h1.add("It");
		h1.add("Civil");
		h1.add("10");
		h1.add(null);
		for(String brName2 : h1)
		{
			System.out.println(brName2);
		}
	/*	Set<String> tree_set=new TreeSet<>(h);
		System.out.println(h);
		
		*/
	}
}

