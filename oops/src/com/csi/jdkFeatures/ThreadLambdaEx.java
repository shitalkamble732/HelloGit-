package com.csi.jdkFeatures;

public class ThreadLambdaEx {
	public static void main(String[] args) {
		
	
	Runnable r1=()->
	{
		System.out.println("Thread 1 is running....");
	};
	Thread tt=new Thread(r1);
	tt.start();
	}
}
