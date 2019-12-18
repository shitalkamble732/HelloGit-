package com.csi.CollectionConcepts;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsArrayListDemo {

		   public static void main(String[] args) {
		      // ArrayList 
		      ArrayList  a1 = new ArrayList();
		      a1.add(1);
		      a1.add(2);
		      a1.add(3);
		     
		      System.out.println(" ArrayList Elements");
		      System.out.print("\t" + a1);
		      Collections.reverse(a1);
		      System.out.println("\n the elements are in reverse order : "+a1);

		     
		      boolean ans=a1.contains(3);
		      if(ans)
		      {
		    	  System.out.println("the list contains 3");
		      }
		      else
		      {
		    	  System.out.println("the list is not having 3");
		      }
		      
		      
		      
		      ArrayList<String> arr = new ArrayList<String>(4); 
		      
		        // using add() to initialize values 
		        // ["geeks", "for", "geeks"] 
		        arr.add("geeks"); 
		        arr.add("for"); 
		        arr.add("geeks"); 
		        arr.add("Coding");
		        arr.add("Challenge");
		        
		        System.out.println("Sublist in the  given arraylist : "+arr.subList(1, 5));
		        System.out.println("size of the arraylist : "+arr.size());
		        System.out.println(" a copy of the given arrayList : "+arr.clone());
		  
		     
		        // use contains() to check if the element 
		        // "geeks" exits or not 
		        boolean ans1 = arr.contains("Coding"); 
		  
		        if (ans1) 
		            System.out.println("The list contains geeks"); 
		        else
		            System.out.println("The list does not contains geeks"); 
		        
		        
		        
		        ArrayList<String> arr2=new ArrayList<>();
		        arr2.add("A");
		        arr2.add("B");
		        arr2.add("C");
		        
		        arr2.addAll(arr);
		        System.out.println("elements in arrayList :"+arr2);
		       // System.out.println("retains :"+arr2.retainAll(arr2));
		        
		        System.out.println("arr elements : "+arr);
		        
		        
		        System.out.println("\n arr2 elements : "+arr2);

		        boolean ans2= arr2.containsAll(arr);
		        if(ans2)
		        	System.out.println("arr2 contains a list of arr");
		        else
		        	System.out.println("Not contain elements of arr in arr2");
		      /*
		      // LinkedList
		      List l1 = new LinkedList();
		      l1.add("Zara");
		      l1.add("Mahnaz");
		      l1.add("Ayan");
		      System.out.println();
		      System.out.println(" LinkedList Elements");
		      System.out.print("\t" + l1);
*/
		      
		      /*
		      // HashSet
		      Set s1 = new HashSet(); 
		      s1.add("Zara");
		      s1.add("Mahnaz");
		      s1.add("Ayan");
		      System.out.println();
		      System.out.println(" Set Elements");
		      System.out.print("\t" + s1);*/

		   /*   // HashMap
		      Map m1 = new HashMap(); 
		      m1.put("Zara", "8");
		      m1.put("Mahnaz", "31");
		      m1.put("Ayan", "12");
		      m1.put("Daisy", "14");
		      System.out.println();
		      System.out.println(" Map Elements");
		      System.out.print("\t" + m1);*/
		   }
		}


