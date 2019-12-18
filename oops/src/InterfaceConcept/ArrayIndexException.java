package InterfaceConcept;

public class ArrayIndexException {
	public static void main(String[] args) {
		
		try
		{
			int arr[]={1,3,5,7,9,0};
			System.out.println(arr[10]);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("rest of code");
	}

}
