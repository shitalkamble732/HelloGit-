package com.csi.jdkFeatures;

public class methodreference {
	
	static void threadStatus()
	{
		System.out.println("Thread is running............");
	}
	
	public static void main(String[] args) {
		
		Thread mm=new Thread(methodreference::threadStatus);
		mm.start();
	}

}
