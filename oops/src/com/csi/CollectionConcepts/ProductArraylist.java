package com.csi.CollectionConcepts;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductArraylist {
	
	public static void main(String[] args) {
		
	ArrayList<String> ProductList= new ArrayList<>();
	System.out.println("plz enter the product name which you want's to search  : ");
	Scanner sc=new Scanner(System.in);
	String productName=sc.next();
	
	ProductList.add("ASUS");
	ProductList.add("MI");
	ProductList.add("APPLE");
	ProductList.add("Lenovo");
	
	if(ProductList.contains(productName))
	{
		System.out.println("Product is available...");
	}
	else
	{
		System.out.println("Product is not available...");
	}
	
	}

}
