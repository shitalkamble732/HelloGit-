package com.csi.CollectionConcepts;

public class DirectCallRun {
	
		 public void run(){  
		  for(int i=1;i<5;i++){  
		    try
		    {
		    	Thread.sleep(500);
		    }
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(i);  
		  }  
	 }  
		 public static void main(String args[]){  
		  DirectCallRun t1=new DirectCallRun();  
		  DirectCallRun t2=new DirectCallRun();  
		  
		 
		  t1.run();  
		  t2.run();  
		 }  
	}  


