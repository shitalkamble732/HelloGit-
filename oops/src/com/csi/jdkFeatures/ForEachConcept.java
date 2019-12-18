package com.csi.jdkFeatures;

import java.util.ArrayList;

class CustomerDB
{
	int custId;
	String CustName;
	
	
	public CustomerDB(int custId, String custName) {
		super();
		this.custId = custId;
		CustName = custName;
	}


	@Override
	public String toString() {
		return "CustomerDB [custId=" + custId + ", CustName=" + CustName + "]";
	}
	
	
}
public class ForEachConcept {
	public static void main(String[] args) {
		ArrayList<CustomerDB> custList=new ArrayList<>();
		custList.add(new CustomerDB(12, "Rohini"));
		custList.add(new CustomerDB(13, "Priya"));
		custList.add(new CustomerDB(45, "Pallavi"));
		
		// custList.forEach(System.out::println);
		
		custList.forEach(cc->System.out.println(cc));
		
		for(CustomerDB cc:custList)
		{
			System.out.println(cc);
		}
		
	}

}
