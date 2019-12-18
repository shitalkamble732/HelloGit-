package com.csi.typecasting;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //binary to decimal
		String strbinary="1010";
		int decimal=Integer.parseInt(strbinary, 2);
		System.out.println(decimal);

		//decimal to binary
		System.out.println(Integer.toBinaryString(15));	
		
		//Decimal to hexadecimal 
		System.out.println(Integer.toHexString(10));
		//hex to decimal
		String strdec="a";
		System.out.println(Integer.parseInt(strdec, 16));
		
		//dec to octal
		System.out.println(Integer.toOctalString(9));
		
		//octal to dec
		String strdec1= "121";
		System.out.println(Integer.parseInt(strdec1, 8));
	}

}
