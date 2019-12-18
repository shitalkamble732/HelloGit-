package InterfaceConcept;

public class MainException extends Exception {
	// A Class that represents use-defined expception 
	
	    public MainException(String s) 
	    { 
	        // Call constructor of parent Exception 
	        super(s); 
	    } 
	  
	// A Class that uses above MyException 
	
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            // Throw an object of user defined exception 
	            throw new MainException("GeeksGeeks"); 
	        } 
	        catch (MainException ex) 
	        { 
	            System.out.println("Caught"); 
	  
	            // Print the message from MyException object 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
	} 


