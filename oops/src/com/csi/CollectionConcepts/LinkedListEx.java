package com.csi.CollectionConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("IT");
		ll.add("Mech");
		ll.add("CSE");
		ll.add("Civil");
		ll.add("CSE");
		ll.add(2, "Elect");
		ll.addFirst("Petroleum");
		ll.addLast("Chemical");
		
	   // ll.forEach(BrName ->System.out.println(BrName));
		//ll.forEach(System.out :: println);
		/*for(String Branchname : ll)
		{
			System.out.println(Branchname);
		}*/
		Iterator<String> itr=ll.iterator();
	     while (itr.hasNext()) {
			System.out.println(" "+itr.next());
			
		}
	}

}
