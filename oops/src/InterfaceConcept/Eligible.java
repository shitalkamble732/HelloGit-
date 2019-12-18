package InterfaceConcept;

public class Eligible extends Exception{
	public static void main(String[] args) {
		try
		{
		isEligibleForTest(45);
		}
		catch(Exception e)
		{
			System.out.println("Exception  handled");
		}
	}

}
