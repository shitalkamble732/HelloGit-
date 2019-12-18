package com.csi.jdkFeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

class Product
{
	int prodId;
	String prodName;
	double prodPrice;
	
	
	public Product(int prodId, String prodName, double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}


	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice +
				"]";
	}
	
	
}
public class StreamProduct {

	public static void main(String[] args) {
		
	
	LinkedList <Product> prodList= new LinkedList<>();
	prodList.add(new Product(121, "MI", 45000));
	
	prodList.add(new Product(123, "HP", 55000));

	prodList.add(new Product(100, "LENOVO", 62000));

	prodList.add(new Product(156, "SONY", 78056));

	prodList.add(new Product(184, "APPLE", 87200));

	prodList.add(new Product(125, "DELL", 42000));

//	prodList.forEach(System.out::println);
//	prodList.stream().filter(Product->Product.prodPrice<=60000).forEach(System.out::println);
	
//	prodList.stream().filter(Product->Product.prodName.endsWith("Y")).forEach(System.out::println);
	
//	prodList.stream().filter(Product->Product.prodName.contains("PP")).forEach(System.out::println);
	
 //   Long prodCount = prodList.stream().collect(Collectors.counting());
//	System.out.println("\n Product Count : "+prodCount);
	
    Long count=prodList.stream().filter(Product-> Product.prodPrice <=45000).count();
    System.out.println(count);//,forEach(System.out::println);
	}
}