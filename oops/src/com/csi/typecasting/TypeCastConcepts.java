package com.csi.typecasting;

public class TypeCastConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short empId=5000;
		int employeeId=empId;
		System.out.println("Short to int : "+employeeId); 
		long empId1=empId;
		System.out.println("\n Short to long : "+empId1);
		
		int i=5000;
		long l=i;
		System.out.println("\n int to long : "+l);
		float f=l;
		System.out.println("\n int to float : "+f);
		
		double d=12343.45;
		System.out.println("Double : "+d);
		float f1= (float) d;
		System.out.println("double to float : "+f1);
		long l1=(long) d;
		System.out.println("Double to long : "+l1);
		int i1=(int) d;
		System.out.println("double to int : "+i1);
		short s1=(short) d;
		System.out.println("double to short : "+s1);
		byte b1=(byte) d;
		System.out.println("double to byte : "+b1);
		
		long l2=1234567890L;
		System.out.println("\n long to other type conversion :");
		System.out.println("Long : "+l2);
		int i2=(int) l2;
		System.out.println("Long to int : "+i2);
		short s2=(short) l2;
		System.out.println("Long to short : "+s2);
		byte b2=(byte) l2;
		System.out.println("Long to byte : "+b2);
				
		System.out.println("char conversion : ");
		int a=65;
		char c=(char) a;
		System.out.println("int to char : "+c);
		
		char c1='a';
		int i3=(int) c1;
		System.out.println("char to int : "+i3);
		
		//string to integer conversion 
		
		String s="23.6";
		int i4=Integer.parseInt(s+100);
		System.out.println("string to integer : "+i4);
	//	int i5=Integer.valueOf();
		//System.out.println("Value of s : "+i5);
		
		
		long l6=99939393998L;  
		String s4=String.valueOf(l6);  
		System.out.println("Long to string : "+s4);  
		String s5=Long.toString(l6);  
		System.out.println("String to long : "+s5);  
		
	double d3=Double.parseDouble(s);
	System.out.println("string to double : "+d3);
		
		
		
	}

}
