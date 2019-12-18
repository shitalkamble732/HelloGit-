package InterfaceConcept;


public class EligibleForTest extends Eligible {

	static void isEligibleForTest(int marks) throws Exception
	{
		if(marks<=65)
			throw new Exception("not eligible.. ");
		else
			System.out.println("Eligible to give the test");
	}
}

