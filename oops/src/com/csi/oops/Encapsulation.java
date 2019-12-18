package com.csi.oops;

class Product
{
	int prodId;
	String prodName;
	double prodPrice;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
	    if(prodPrice >=24500)
		{
		this.prodPrice = prodPrice;
		}
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pp=new Product();
		pp.setProdId(12);
		pp.setProdName("Laptop");
		pp.setProdPrice(25000);
		System.out.println("\n product Id : "+pp.getProdId()+"\n Product Name = "+pp.getProdName()+"\n Product Price :"+pp.getProdPrice());

	}

}
