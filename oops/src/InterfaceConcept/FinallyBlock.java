package InterfaceConcept;

public class FinallyBlock {
	public static void main(String[] args) {
		
	try
	{
		int data=135/0;
		System.out.println(data);
	}
	catch(ArithmeticException e)
	{
	//	System.out.println(e.toString());
		e.printStackTrace();
	}
	finally
	{
		System.out.println("it's always executed");
	}
}
}