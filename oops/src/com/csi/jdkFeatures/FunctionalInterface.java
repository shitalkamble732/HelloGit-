package com.csi.jdkFeatures;


/*
interface FunctionalInEx
{
	void display(String msg);
}
public class FunctionalInterface implements FunctionalInEx{
	
	@Override
	public void display(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		
	}

public static void main(String[] args) {
		
	FunctionalInterface ff=new FunctionalInterface();
	ff.display("hey ?   Hello..........");
	

*/
interface sayable{  
    void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  
public class FunctionalInterface implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	FunctionalInterface fie = new FunctionalInterface();  
        fie.say("Hello there");  
    }  

}
