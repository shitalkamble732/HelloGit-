package InterfaceConcept;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic exc : "+e);
		}
	/*	catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null Ptr Ecxeption : "+e);
		} */
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		System.out.println("Parent Class Exception ");
		}
		System.out.println("Rest of code ...");
	}

}
