package InterfaceConcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NullPtrException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
		//String s=null;
		//System.out.println(s.charAt(0));//null ptr exception
    /*	  String s="Exception is an abnormal condition";  
    	  System.out.println(s.charAt(36));//str index out of bound exception*/
    	  File file=new File("C:/Users/DELL/Desktop/CSI Learning/abc.txt");
    	  FileReader fr=new FileReader(file);
    	  System.out.println("File exists...");
	  } catch(FileNotFoundException e)
      {
		  System.out.println("File does not exists..");
      }
      catch(StringIndexOutOfBoundsException e)
      {
    	  e.printStackTrace();
      }
	}
}
