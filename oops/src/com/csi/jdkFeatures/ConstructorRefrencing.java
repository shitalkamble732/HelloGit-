package com.csi.jdkFeatures;

/*interface constructorRef
{
	void getMessage(String msg);
}

class ConstructorRefrences
{
	int id;
	String name;
	
	public ConstructorRefrences(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("\n Id : "+id+"\n Name : "+name);
	
	}
	
	
	
}
*/


interface Messageable12{  
    Message getMessage(String msg);  
}  
class Message12{  
    Message12(String msg){  
        System.out.print(msg);  
    }  
}  
 
 
public class ConstructorRefrencing {

	  public static void main(String[] args) {  
	        Messageable12 hello = Message12::new;  
	        hello.getMessage("Hello");  
	    }  
}
