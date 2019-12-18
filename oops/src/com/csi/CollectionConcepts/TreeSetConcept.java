package com.csi.CollectionConcepts;

import java.util.TreeSet;

public class TreeSetConcept {
	
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet<String>();
		t.add("A");
		t.add("Z");
		t.add("s");
		t.add("w");
		t.add("c");
		System.out.println(t);
		//t.add(null); 
		System.out.println("a".compareTo("z"));
		System.out.println("z".compareTo("a"));
		System.out.println("w".compareTo("w"));
		System.out.println("w".compareTo(null));
		//t.add(new Integer(12));//generates ClassCastException
		
		
		
		/*
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("S"));
		t.add(new StringBuffer("M"));
		
		
		System.out.println(t); 
		
		
		*/
		
		}

}
