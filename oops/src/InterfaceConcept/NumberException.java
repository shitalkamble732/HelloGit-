package InterfaceConcept;

public class NumberException {
	public static void main(String[] args) {
		String s=null;
		try
		{
			if(s=="  ")
			{
				System.out.println("String is not null");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
