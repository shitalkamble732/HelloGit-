package com.csi.CollectionConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		HashMap<String, String> hm=new HashMap<>();
		hm.put("ID", "121");
		hm.put("Name", "JERRY");
		hm.put("ADDRESS", "LATUR");
	    hm.put("SALARY", "25300");
	    
	    for(Map.Entry<String, String> m:  hm.entrySet())
	    {
	    	System.out.println(" "+m.getKey()+" "+m.getValue());
	    }
	}

}
