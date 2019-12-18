package com.csi.jdkFeatures;

interface Drawable
{
	
	void draw();
}
	public class LambdaConcept {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width=15;
		Drawable d2=() -> {
			
			System.out.println("Drawing : "+width);
			
			
		};d2.draw();
		}
	}
	
	
