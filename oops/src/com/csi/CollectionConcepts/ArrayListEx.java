package com.csi.CollectionConcepts;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.SizeRequirements;

public class ArrayListEx {
	public static void main(String[] args) {
		
		System.out.println("Arraylist Example : ");
		ArrayList<String > al = new ArrayList<String>();
		al.add("it");
		al.add("mech");
		al.add("cse");
		al.add("civil");
		al.add("elect");
	     al.add("Chemical");
		Comparator<String> c=Collections.reverseOrder();
		Collections.sort(al,c);
		System.out.println(al);
		/*   System.out.println(al.set(3, "COMPUTER"));
		System.out.println(al.contains("CSE"));
		System.out.println();
		System.out.println("Get element ata index 2nd : "+al.get(2));
		al.remove("CSE");
		System.out.println("Size of array list : "+al.size());
		//al.remove(4);
	//	al.isEmpty();  */
		/*Iterator<String> itr=al.iterator();
			while (itr.hasNext()) {
				{
				System.out.println("  "+itr.next());
					
					
				}
			}*/
			
	//	al.forEach(brName->System.out.println(brName));
	//	al.forEach(System.out :: println);
	
	/*for(String brname : al)
	{
		if(brname.contains("Mech"))
		{
		System.out.println(brname);
		}
	}
		*/
	}

}
