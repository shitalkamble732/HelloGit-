package com.csi.jdkFeatures;

import java.util.Arrays;

public class ParellelSort {
	
	public static void main(String[] args) {
		
		int arr[]={4,3,9,8,5,7};
		
		System.out.println("Before Sorting array : ");
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		Arrays.parallelSort(arr, 2, 4);;
		
		System.out.println("After sorting element : ");
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
