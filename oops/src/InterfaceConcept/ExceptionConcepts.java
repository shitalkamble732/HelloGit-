package InterfaceConcept;

public class ExceptionConcepts {
	public static void main(String[] args) {
		
	int result;
	try
	{
		result=12/0;
		System.out.println("Result : "+result);
		//System.out.println("rest of the code ");
	}
 	catch(ArithmeticException |NullPointerException | ArrayIndexOutOfBoundsException e)
	{
		//System.out.println("rest of code ");
		// System.out.println(e.getMessage());
		   e.printStackTrace();
		 
		   isAgeEligible(20);
     }
	}
      public static void isAgeEligible(int age) throws NullPointerException,ArithmeticException,ArrayIndexOutOfBoundsException
	{
		if(age <= 18)
		{
			System.out.println("Not Eligible...");
		}
		else
		{
			System.out.println("Eligible for vote....");
		}
	}
}	

