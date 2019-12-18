package InterfaceConcept;

public class TestEligibility {
	public static void main(String[] args) {
		//int marks=67;
		try
		{
			isEligibleForadm(65);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
public static void isEligibleForadm(int marks) throws Exception
{
	if(marks >=65)
	{
		System.out.println("Eligible to take the admission");
	}
	else {
		System.out.println("Not eligible");
	}
}
}
