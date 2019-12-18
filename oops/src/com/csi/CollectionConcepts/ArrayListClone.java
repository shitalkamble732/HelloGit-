package com.csi.CollectionConcepts;

import java.util.ArrayList;

public class ArrayListClone {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> arr1=new ArrayList<>();
		arr1.add("IT");
		arr1.add("MECH");
		arr1.add("CSE");
		arr1.add("ELECT");
		System.out.println("array1 : "+arr1);
		//ArrayList<String>arr2=new ArrayList<>();
		ArrayList<String> arr2=(ArrayList) arr1.clone();
		
		System.out.println("Copy of Arr1 : "+arr2);
		System.out.println("in arr1 index of 2nd position : "+arr1.get(2));
		String str=arr1.get(0);
		System.out.println(str);
		
		System.out.println(str.concat("COMP"));
		System.out.println(str);
		System.out.println(arr1);
	}

}
