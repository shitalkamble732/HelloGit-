package com.csi.typecasting;

import java.text.*;
//import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TypeCastConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* String sDate1="31/12/1998";  
		    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		    System.out.println(sDate1+"\t"+date1);  */
		
		 Date date = Calendar.getInstance().getTime();  
         DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
         String strDate = dateFormat.format(date);  
         System.out.println("Converted String: " + strDate);
       
         
         //str to char
         String s="Hello";
         char c=s.charAt(4);
         System.out.println("char at 3rd pos :"+c);
         char ch[]=s.toCharArray();
         for(int i=0; i<ch.length;i++)
         {
        	 System.out.println("char at "+i+" index is "+ch[i]);
         }
         
         // char to str
         
         char  c1='D';
         String s1=String.valueOf(c1);
         System.out.println("char to string : "+s1);
         String s2=Character.toString(c1);
         System.out.println("char to str : "+s2);
         Object ob=s;
         System.out.println("string to obj : "+ob);      
//       int to char
         Object ob1=s;
         System.out.println("obj to string : "+ob1);
         //char to int 
         int c6=c1;
         System.out.println("Char to int : "+c6);
         // string to boolean
         String s3="true";
         String s4="TRue";
         String s5= "ok";
         boolean b=Boolean.parseBoolean(s3);
         boolean b1=Boolean.parseBoolean(s4);
         boolean b2=Boolean.parseBoolean(s5);
         System.out.println("s3 : "+b);
         System.out.println(b1);
         System.out.println(b2);
         // str to boolean using valueOf() method
         Boolean b3=Boolean.valueOf(s5);
         System.out.println("str to boolean : "+b3);
         Boolean b4=Boolean.valueOf(s4);
         System.out.println("str to boolean : "+b4);

// boolean to string
         boolean b5=true;
         boolean b6=false;
         String s6=String.valueOf(b5);
         System.out.println(b5);
         String s7=String.valueOf(b6);
         System.out.println(s7);
         
         //using .toString() method
         String s8=Boolean.toString(b5);
         System.out.println(s8);
         String s9=Boolean.toString(b6);
         System.out.println(s9);
	}

}
