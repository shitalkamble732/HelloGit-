package com.csi.jdkFeatures;

import java.util.StringJoiner;

public class StringJoinerConcept {
	public static void main(String[] args) {
		
		StringJoiner sj=new StringJoiner("&");
		sj.add("TCS");
		sj.add("INFOSYS");
		sj.add("WIPRO");
		sj.add("CAPGEMINI");
		
		System.out.println(sj);
	}

}
