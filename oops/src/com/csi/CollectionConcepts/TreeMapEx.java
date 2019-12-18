package com.csi.CollectionConcepts;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<String, String> hm = new TreeMap<>();
		hm.put("ID", "121");
		hm.put("Name", "JERRY");
		hm.put("ADDRESS", "LATUR");
	    hm.put("SALARY", "25300");
	    
	    for(Map.Entry<String, String> m:hm.entrySet())
	    {
	    	System.out.println(" "+m.getKey()+" "+m.getValue());
	    }
		}
}
