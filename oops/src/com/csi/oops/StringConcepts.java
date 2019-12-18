/**
 * 
 */
package com.csi.oops;

/**
 * @author DELL
 *
 */
public class StringConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="COMPUTER";
		String s3="computer";
		String s5="COMPUTER";
		String s2= new String("  Comp Science   ");
		System.out.println(s1==s5);
		System.out.println("s1==s5 : "+s1==s5);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s2.isEmpty());
		System.out.println(s1.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,7));
		System.out.println(s1.indexOf("P"));
		System.out.println(s1.charAt(7));
		System.out.println(s1.concat(s2));
		System.out.println(s1.matches(s3));
		System.out.println(s2.trim());
        System.out.println(s1.concat("Pune"));
        System.out.println(s1.replace("R", "s"));
		System.out.println(s1.startsWith("O"));
		System.out.println(s1.lastIndexOf("R"));
		System.out.println(s1.endsWith("R"));
	//	System.out.println(s1.sr);
		
		
		StringBuffer sbb=new StringBuffer("StringBuffer is Mutable");
		System.out.println(sbb);
	    StringBuffer sb= new StringBuffer("String");
	    System.out.println(sb.append("Buffer"));
	    System.out.println(sb.length());
	    System.out.println(sb.substring(6));
	    System.out.println(sb.substring(3,6));    
	   // System.out.println(sb.delete(3, 5));
	    System.out.println(sb.capacity());
	    System.out.println(sbb.capacity());
	    System.out.println(sb.equals(sbb));
	    System.out.println(sbb.indexOf("B"));
	    System.out.println(sb.charAt(3));
	    System.out.println(sb);
	    System.out.println(sb.insert(1, 'P'));
	    System.out.println(sb.reverse());
	    System.out.println(sb.indexOf("B"));
	    System.out.println(sb.append('M'));
	    System.out.println(sb.reverse());
	    System.out.println(sbb);
	    System.err.println(sbb.replace(0, 4, "The"));
	  //  System.out.println(sbb.);
	   
	}
	

}
