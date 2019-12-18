package com.csi.CollectionConcepts;

import java.util.TreeSet;

public class TreeSetEx {
	
	public static void main(String[] args) {
		
		TreeSet<String> tt=new TreeSet<>();
		 tt.add("A");
		 tt.add("Z");
		 tt.add("K");
	     tt.add("A");
	    
	     tt.add("y");
	     tt.add("a");
			
			for(String brName :tt)
			{
				System.out.println(brName);
			}
	}

}
