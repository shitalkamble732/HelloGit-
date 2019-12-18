package InterfaceConcept;

public class MyException  {

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