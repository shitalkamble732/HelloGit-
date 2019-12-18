package InterfaceConcept;

class MyException extends Exception  {

	public void  MyException(int marks)
	{
		if(marks<=65)
		{
			System.out.println("not eligible to take the test");
		}
		else
		{
			System.out.println("eligible for test..");
	}
}
}
public class MyException2 extends MyException
{
public static void main(String[] args) {
	try
	{
		throw new MyException(65);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
}
