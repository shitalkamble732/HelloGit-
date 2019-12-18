package com.csi.jdkFeatures;

interface Instances
{
	void instance1();
}
public class InstanceMethodrefrences {
	
      void display()
      {
    	  System.out.println("it's not static method...");
      }
      public static void main(String[] args) {
		
    	  
    	  InstanceMethodrefrences r1=new InstanceMethodrefrences();   //creating object
    	  
    	  Instances i=r1::display;  //referring non static method
    	  
    	  i.instance1();      //calling interface method
    	  
    	  Instances i2=r1::display; //creating anonymous  obj that will  also calling interface method
    	  
    	  i2.instance1();
	}

	
}
